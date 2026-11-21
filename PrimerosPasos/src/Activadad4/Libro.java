package Activadad4;

import java.util.Arrays;

public class Libro extends Publicacion {

    private String[] autores;
    private int anioPublicacion;

    public Libro(String titulo, String[] autores, int anioPublicacion, int edicion,
                 String editorial, int cantidadEjemplares) {
        super(titulo, editorial, edicion, cantidadEjemplares);
        this.autores = autores;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro [" + super.toString() + ", autores=" + Arrays.toString(autores)
                + ", anioPublicacion=" + anioPublicacion + "]";
    }
}