package Act4Problema2;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Persona otra = (Persona) o;
        return Objects.equals(nombre, otra.nombre) && Objects.equals(telefono, otra.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }

    @Override
    public int compareTo(Persona otra) {
        int resultado = nombre.compareTo(otra.nombre);
        if (resultado != 0) {
            return resultado;
        }
        return telefono.compareTo(otra.telefono);
    }
}