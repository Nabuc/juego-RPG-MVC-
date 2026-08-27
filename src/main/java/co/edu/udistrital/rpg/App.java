package co.edu.udistrital.rpg;
import co.edu.udistrital.rpg.modelo.RepositorioPersonajes;
import io.javalin.Javalin;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
        }).start(7070);
        app.get("/personajes", ctx -> ctx.json(RepositorioPersonajes.obtenerTodos()));
    }
}