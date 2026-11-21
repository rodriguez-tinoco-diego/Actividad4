package Act4Problema3;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaTrail {

    public static void main(String[] args) {
        Categoria k21f = new Categoria("Trail 21K", 21.0, "Femenino");
        Categoria k21fCopia = new Categoria("Trail 21K", 21.0, "Femenino");
        Categoria k21m = new Categoria("Trail 21K", 21.0, "Masculino");
        Categoria k10m = new Categoria("Trail 10K", 10.0, "Masculino");

        Competidor co1 = new Competidor("María Hernández López", "Femenino", k21f);
        Competidor co2 = new Competidor("María Hernández López", "Femenino", k21f);
        Competidor co3 = new Competidor("Jorge Salas Díaz", "Masculino", k21m);
        Competidor co4 = new Competidor("Pedro Luna Vega", "Masculino", k10m);

        System.out.println("=== Herencia y polimorfismo ===");
        Persona persona = co1; // variable de la clase base que apunta a un Competidor
        System.out.println("Persona persona = co1  ->  " + persona); // se ejecuta el toString de Competidor

        System.out.println();
        System.out.println("=== equals ===");
        System.out.println("k21f.equals(k21fCopia) mismos datos: " + k21f.equals(k21fCopia));
        System.out.println("k21f.equals(k21m) otro genero: " + k21f.equals(k21m));
        System.out.println("k21f.equals(k10m) otra distancia: " + k21f.equals(k10m));
        System.out.println("co1.equals(co2) mismo nombre y genero: " + co1.equals(co2));
        System.out.println("co1.equals(co3) otro competidor: " + co1.equals(co3));
        System.out.println("co1.equals(null): " + co1.equals(null));

        System.out.println();
        System.out.println("=== hashCode ===");
        System.out.println("k21f y k21fCopia (iguales) mismo hashCode: " + (k21f.hashCode() == k21fCopia.hashCode()));
        System.out.println("co1 y co2 (iguales) mismo hashCode: " + (co1.hashCode() == co2.hashCode()));

        System.out.println();
        System.out.println("=== compareTo (-1 antes, 0 igual, 1 despues) ===");
        System.out.println("k21f.compareTo(k21fCopia) = " + Integer.signum(k21f.compareTo(k21fCopia)));
        System.out.println("k21f.compareTo(k21m) = " + Integer.signum(k21f.compareTo(k21m)));
        System.out.println("k10m.compareTo(k21f) = " + Integer.signum(k10m.compareTo(k21f)));
        System.out.println("co1.compareTo(co2) = " + Integer.signum(co1.compareTo(co2)));
        System.out.println("co3.compareTo(co1) = " + Integer.signum(co3.compareTo(co1)) + "  (Jorge antes que Maria)");
        System.out.println("co4.compareTo(co1) = " + Integer.signum(co4.compareTo(co1)) + "  (Pedro despues de Maria)");

        System.out.println();
        System.out.println("=== Collections.sort ===");
        List<Persona> lista = new ArrayList<>();
        lista.add(co1);
        lista.add(co4);
        lista.add(co3);
        Collections.sort(lista);
        for (Persona p : lista) {
            System.out.println("  " + p);
        }

        System.out.println();
        System.out.println("=== Catalogo (el sistema asigna el numero) ===");
        Catalogo catalogo = new Catalogo();
        catalogo.agregarCategoria(k21f);
        catalogo.agregarCategoria(k21m);
        catalogo.agregarCategoria(k10m);
        catalogo.agregarCompetidor(co1);
        catalogo.agregarCompetidor(co3);
        catalogo.agregarCompetidor(co4);
        System.out.println(catalogo);

        System.out.println();
        System.out.println("=== registrarResultado ===");
        co1.registrarResultado(true, Duration.ofHours(2).plusMinutes(31).plusSeconds(45), true);
        co4.registrarResultado(false, null, false);
        System.out.println(co1);
        System.out.println(co4);

        System.out.println();
        System.out.println("=== eliminarCompetidor y nuevo registro ===");
        System.out.println("Se elimina co2 (igual a co1) y se registra a Ana, que recibe el numero 4:");
        catalogo.eliminarCompetidor(co2);
        catalogo.agregarCompetidor(new Competidor("Ana Gómez Ruiz", "Femenino", k21f));
        System.out.println(catalogo);
    }
}