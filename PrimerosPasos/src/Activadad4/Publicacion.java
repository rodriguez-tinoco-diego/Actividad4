package Activadad4;

import java.util.Objects;

public class Publicacion implements Comparable<Publicacion> {

    private String titulo;
    private String editorial;
    private int edicion;
    private int cantidadEjemplares;

    public Publicacion(String titulo, String editorial, int edicion, int cantidadEjemplares) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.edicion = edicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public void agregarEjemplares(int cantidad) {
        cantidadEjemplares = cantidadEjemplares + cantidad;
    }

    public void retirarEjemplares(int cantidad) {
        if (cantidad <= cantidadEjemplares) {
            cantidadEjemplares = cantidadEjemplares - cantidad;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Publicacion otra = (Publicacion) o;
        return edicion == otra.edicion
                && Objects.equals(titulo, otra.titulo)
                && Objects.equals(editorial, otra.editorial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, edicion, editorial);
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", editorial=" + editorial + ", edicion=" + edicion
                + ", cantidadEjemplares=" + cantidadEjemplares;
    }

    @Override
    public int compareTo(Publicacion otro) {
        int resultado = titulo.compareTo(otro.titulo);
        if (resultado != 0) {
            return resultado;
        }
        resultado = Integer.compare(edicion, otro.edicion);
        if (resultado != 0) {
            return resultado;
        }
        return editorial.compareTo(otro.editorial);
    }
}