package Act4Problema3;


import java.util.Objects;

public class Categoria implements Comparable<Categoria> {

    private String nombreCategoria;
    private double distancia;
    private String generoCompetidores;

    public Categoria(String nombreCategoria, double distancia, String generoCompetidores) {
        this.nombreCategoria = nombreCategoria;
        this.distancia = distancia;
        this.generoCompetidores = generoCompetidores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Categoria otra = (Categoria) o;
        return Double.compare(distancia, otra.distancia) == 0
                && Objects.equals(nombreCategoria, otra.nombreCategoria)
                && Objects.equals(generoCompetidores, otra.generoCompetidores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCategoria, distancia, generoCompetidores);
    }

    @Override
    public String toString() {
        return "Categoria [nombreCategoria=" + nombreCategoria + ", distancia=" + distancia
                + " km, generoCompetidores=" + generoCompetidores + "]";
    }

    @Override
    public int compareTo(Categoria otra) {
        int resultado = nombreCategoria.compareTo(otra.nombreCategoria);
        if (resultado != 0) {
            return resultado;
        }
        resultado = Double.compare(distancia, otra.distancia);
        if (resultado != 0) {
            return resultado;
        }
        return generoCompetidores.compareTo(otra.generoCompetidores);
    }
}