package co.edu.udistrital.rpg.servicios;
import co.edu.udistrital.rpg.modelo.Personaje;

import java.util.ArrayList;
import java.util.List;

public class PersonajeServicio {
    public void validarPersonaje(Personaje personaje){
        List<String> errores = new ArrayList<>();
        if (personaje.getNombre() == null || personaje.getNombre().isBlank() || personaje.getClaseRPG() == null || personaje.getClaseRPG().isBlank())
        {
            errores.add("Todos los campos son obligatorios");
        }
        if (personaje.getNivel() < 1 || personaje.getNivel() > 100){
        errores.add("El nivel debe estar entre 1 y 100");
        }
        String clase = personaje.getClaseRPG();
        if (!clase.equals("Guerrero") && !clase.equals("Mago") && !clase.equals("Arquero")&& !clase.equals("Guerrero")) {
            errores.add("Clase no válida, debe ser(Mago,Arquero,Guerrero)");
        }
        if (personaje.getVida() < 0) {
            errores.add("La vida debe ser un valor positivo");
        }
        if (!errores.isEmpty()){
            throw new IllegalArgumentException(String.join(" ", errores));
        }
    }
}
