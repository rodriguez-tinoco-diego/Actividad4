package Activadad4;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Libro> listaLibros;

    public Catalogo() {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        listaLibros.remove(libro); // busca el libro con equals
    }

    @Override
    public String toString() {
        String texto = "Catalogo de libros (" + listaLibros.size() + "):";
        for (Libro libro : listaLibros) {
            texto = texto + "\n  " + libro;
        }
        return texto;
    }
}