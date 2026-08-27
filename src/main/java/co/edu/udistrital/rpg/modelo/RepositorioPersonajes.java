package co.edu.udistrital.rpg.modelo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPersonajes {
    public static List<Personaje> listaPersonajes = new ArrayList<>();

    public static void agregarPersonaje(Personaje nuevoPersonaje) {
        listaPersonajes.add((nuevoPersonaje));
    }

    public static List<Personaje> obtenerTodos(){
        return listaPersonajes;
    }
}
