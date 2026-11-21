package Act4Problema3;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Categoria> listaCategorias;
    private List<Competidor> listaCompetidores;
    private int ultimoNumero;

    public Catalogo() {
        listaCategorias = new ArrayList<>();
        listaCompetidores = new ArrayList<>();
        ultimoNumero = 0;
    }

    public void agregarCategoria(Categoria categoria) {
        listaCategorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        listaCategorias.remove(categoria);
    }

    public void agregarCompetidor(Competidor competidor) {
        ultimoNumero = ultimoNumero + 1;
        competidor.asignarNumero(ultimoNumero); // el sistema asigna el numero al registrarse
        listaCompetidores.add(competidor);
    }

    public void eliminarCompetidor(Competidor competidor) {
        listaCompetidores.remove(competidor); // busca al competidor con equals
    }

    @Override
    public String toString() {
        String texto = "Categorias (" + listaCategorias.size() + "):";
        for (Categoria c : listaCategorias) {
            texto = texto + "\n  " + c;
        }
        texto = texto + "\nCompetidores (" + listaCompetidores.size() + "):";
        for (Competidor c : listaCompetidores) {
            texto = texto + "\n  " + c;
        }
        return texto;
    }
}