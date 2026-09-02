package co.edu.udistrital.rpg;
import co.edu.udistrital.rpg.modelo.Personaje;
import co.edu.udistrital.rpg.modelo.RepositorioPersonajes;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.fileRenderer(new JavalinThymeleaf());
        }).start(7070);
        //app.get("/personajes", ctx -> ctx.json(RepositorioPersonajes.obtenerTodos()));
        app.get("/personajes", ctx -> {
            Map<String,Object> modeloVista = new HashMap<>();
            modeloVista.put("personajesRPG",RepositorioPersonajes.obtenerTodos());
            ctx.render("vista/personajes.html", modeloVista);
        });
        app.post("/personajes", ctx -> {
            String nombre = ctx.formParam("nombre");
            String claseRPG = ctx.formParam("claseRPG");
            int nivel = Integer.parseInt(ctx.formParam("nivel"));
            int vida = Integer.parseInt(ctx.formParam("vida"));

            Personaje nuevoHeroe= new Personaje(nombre,claseRPG,nivel,vida);
            RepositorioPersonajes.agregarPersonaje(nuevoHeroe);

            ctx.redirect("/personajes");
        });
    }
}