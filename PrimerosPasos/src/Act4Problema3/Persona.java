package Act4Problema3;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private String nombreCompleto;
    private String genero;

    public Persona(String nombreCompleto, String genero) {
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
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
        return Objects.equals(nombreCompleto, otra.nombreCompleto)
                && Objects.equals(genero, otra.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, genero);
    }

    @Override
    public String toString() {
        return "nombreCompleto=" + nombreCompleto + ", genero=" + genero;
    }

    @Override
    public int compareTo(Persona otra) {
        int resultado = nombreCompleto.compareTo(otra.nombreCompleto);
        if (resultado != 0) {
            return resultado;
        }
        return genero.compareTo(otra.genero);
    }
}