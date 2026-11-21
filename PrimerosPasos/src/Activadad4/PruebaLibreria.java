package Activadad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaLibreria {

    public static void main(String[] args) {
        Libro l1 = new Libro("El principito", new String[] {"Antoine de Saint-Exupéry"}, 1943, 1, "Salamandra", 10);
        Libro l2 = new Libro("El principito", new String[] {"Antoine de Saint-Exupéry"}, 1943, 1, "Salamandra", 3);
        Libro l3 = new Libro("Cien años de soledad", new String[] {"Gabriel García Márquez"}, 1967, 1, "Sudamericana", 5);
        Libro l4 = new Libro("El principito", new String[] {"Antoine de Saint-Exupéry"}, 1943, 2, "Salamandra", 7);

        System.out.println("=== toString ===");
        System.out.println(l1);
        System.out.println(l3);

        System.out.println();
        System.out.println("=== equals (igualdad por titulo, edicion y editorial) ===");
        System.out.println("l1.equals(l1) reflexiva ............. " + l1.equals(l1));
        System.out.println("l1.equals(l2) mismo libro, otra existencia: " + l1.equals(l2));
        System.out.println("l2.equals(l1) simetrica ............. " + l2.equals(l1));
        System.out.println("l1.equals(l3) otro titulo ........... " + l1.equals(l3));
        System.out.println("l1.equals(l4) otra edicion .......... " + l1.equals(l4));
        System.out.println("l1.equals(null) ..................... " + l1.equals(null));
        System.out.println("l1.equals(\"texto\") otro tipo ........ " + l1.equals("texto"));

        System.out.println();
        System.out.println("=== hashCode ===");
        System.out.println("l1.hashCode() = " + l1.hashCode());
        System.out.println("l2.hashCode() = " + l2.hashCode());
        System.out.println("l1 y l2 son iguales, mismo hashCode: " + (l1.hashCode() == l2.hashCode()));
        System.out.println("l3.hashCode() = " + l3.hashCode());

        System.out.println();
        System.out.println("=== compareTo (signo del resultado) ===");
        System.out.println("l1.compareTo(l2) = " + Integer.signum(l1.compareTo(l2)) + "  (0: son iguales)");
        System.out.println("l3.compareTo(l1) = " + Integer.signum(l3.compareTo(l1)) + "  (-1: 'Cien...' va antes que 'El...')");
        System.out.println("l1.compareTo(l3) = " + Integer.signum(l1.compareTo(l3)) + "  (1: 'El...' va despues)");
        System.out.println("l1.compareTo(l4) = " + Integer.signum(l1.compareTo(l4)) + "  (-1: edicion 1 antes que edicion 2)");
        System.out.println("l4.compareTo(l1) = " + Integer.signum(l4.compareTo(l1)) + "  (1)");

        System.out.println();
        System.out.println("=== Collections.sort (orden natural) ===");
        List<Libro> lista = new ArrayList<>();
        lista.add(l1);
        lista.add(l4);
        lista.add(l3);
        Collections.sort(lista);
        for (Libro libro : lista) {
            System.out.println("  " + libro);
        }

        System.out.println();
        System.out.println("=== agregarEjemplares / retirarEjemplares ===");
        l1.agregarEjemplares(5);
        System.out.println("Despues de agregar 5:  " + l1);
        l1.retirarEjemplares(4);
        System.out.println("Despues de retirar 4:  " + l1);
        try {
            l1.retirarEjemplares(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado al retirar 100: " + e.getMessage());
        }
        try {
            new Libro("Libro con 6 autores", new String[] {"A", "B", "C", "D", "E", "F"}, 2020, 1, "Editorial X", 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado con 6 autores: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Catalogo: agregarLibro / eliminarLibro ===");
        Catalogo catalogo = new Catalogo();
        catalogo.agregarLibro(l1);
        catalogo.agregarLibro(l3);
        catalogo.agregarLibro(l4);
        System.out.println(catalogo);
        System.out.println();
        System.out.println("Se elimina l2 (igual a l1 segun equals):");
        catalogo.eliminarLibro(l2);
        System.out.println(catalogo);
    }
}