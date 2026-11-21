package curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Estudiante> lista = new ArrayList<>();

        lista.add(new Estudiante("Ana", 8.5));
        lista.add(new Estudiante("Luis", 9.2));
        lista.add(new Estudiante("Carlos", 7.8));
        lista.add(new Estudiante("María", 9.8));
        lista.add(new Estudiante("Pedro", 6.5));
        lista.add(new Estudiante("Sofía", 8.9));

        // Ordena usando el compareTo() de Estudiante
        Collections.sort(lista);

        System.out.println("=== Ordenados de MAYOR a MENOR por promedio ===");
        for (Estudiante e : lista) {
            System.out.println(e.presentarse());
        }

        // Demostración de polimorfismo con referencia de tipo Persona
        System.out.println("\n=== Polimorfismo con referencias de tipo Persona ===");
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Marta"));
        personas.add(new Estudiante("Carlos", 7.8));
        personas.add(new Estudiante("Sofía", 9.5));

        for (Persona p : personas) {
            System.out.println(p.presentarse());
        }
    }
}