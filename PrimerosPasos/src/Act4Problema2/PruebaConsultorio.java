package Act4Problema2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaConsultorio {

    public static void main(String[] args) {
        Especialista e1 = new Especialista("Laura Mendoza Ruiz", "Cardiología", "1234567", "2721112233", "laura@consultorio.mx");
        Especialista e2 = new Especialista("Laura Mendoza Ruiz", "Cardiología", "1234567", "2721112233", "otro@correo.mx");
        Especialista e3 = new Especialista("Carlos Pérez Soto", "Dermatología", "7654321", "2723334455", "carlos@consultorio.mx");

        Paciente p1 = new Paciente("Ana Torres Gil", "2724445566", LocalDate.of(1985, 4, 12), "Calle 5 #100");
        Paciente p2 = new Paciente("Ana Torres Gil", "2724445566", LocalDate.of(1985, 4, 12), "Av. Reforma 20");
        Paciente p3 = new Paciente("Luis Ramírez Cruz", "2726667788", LocalDate.of(1990, 8, 30), "Calle 8 #45");

        Cita c1 = new Cita(LocalDate.of(2026, 11, 20), LocalTime.of(10, 30), e1, p1);
        Cita c2 = new Cita(LocalDate.of(2026, 11, 20), LocalTime.of(10, 30), e2, p2);
        Cita c3 = new Cita(LocalDate.of(2026, 11, 20), LocalTime.of(9, 0), e3, p3);
        Cita c4 = new Cita(LocalDate.of(2026, 11, 18), LocalTime.of(16, 0), e1, p3);

        System.out.println("=== Herencia y polimorfismo ===");
        List<Persona> personas = new ArrayList<>();
        personas.add(p3);
        personas.add(e1);
        personas.add(p1);
        personas.add(e3);
        System.out.println("Lista de Persona con Especialistas y Pacientes (cada uno usa su toString):");
        for (Persona persona : personas) {
            System.out.println("  " + persona);
        }
        Collections.sort(personas);
        System.out.println("Ordenada con el compareTo heredado de Persona:");
        for (Persona persona : personas) {
            System.out.println("  " + persona);
        }

        System.out.println();
        System.out.println("=== equals ===");
        System.out.println("e1.equals(e2) mismo nombre y telefono: " + e1.equals(e2));
        System.out.println("e1.equals(e3) otro especialista: " + e1.equals(e3));
        System.out.println("p1.equals(p2) mismo nombre y telefono: " + p1.equals(p2));
        System.out.println("p1.equals(p3) otro paciente: " + p1.equals(p3));
        System.out.println("c1.equals(c2) misma fecha, hora, especialista y paciente: " + c1.equals(c2));
        System.out.println("c1.equals(c3) otra hora, especialista y paciente: " + c1.equals(c3));
        System.out.println("c1.equals(null): " + c1.equals(null));

        System.out.println();
        System.out.println("=== hashCode ===");
        System.out.println("e1 y e2 (iguales) mismo hashCode: " + (e1.hashCode() == e2.hashCode()));
        System.out.println("p1 y p2 (iguales) mismo hashCode: " + (p1.hashCode() == p2.hashCode()));
        System.out.println("c1 y c2 (iguales) mismo hashCode: " + (c1.hashCode() == c2.hashCode()));

        System.out.println();
        System.out.println("=== compareTo (-1 antes, 0 igual, 1 despues) ===");
        System.out.println("e1.compareTo(e2) = " + Integer.signum(e1.compareTo(e2)));
        System.out.println("e3.compareTo(e1) = " + Integer.signum(e3.compareTo(e1)));
        System.out.println("p1.compareTo(p3) = " + Integer.signum(p1.compareTo(p3)));
        System.out.println("c1.compareTo(c2) = " + Integer.signum(c1.compareTo(c2)));
        System.out.println("c3.compareTo(c1) = " + Integer.signum(c3.compareTo(c1)) + "  (9:00 antes que 10:30)");
        System.out.println("c4.compareTo(c1) = " + Integer.signum(c4.compareTo(c1)) + "  (18 de nov antes que 20 de nov)");

        System.out.println();
        System.out.println("=== Collections.sort de citas ===");
        List<Cita> citas = new ArrayList<>();
        citas.add(c1);
        citas.add(c3);
        citas.add(c4);
        Collections.sort(citas);
        for (Cita c : citas) {
            System.out.println("  " + c);
        }

        System.out.println();
        System.out.println("=== Catalogo ===");
        Catalogo catalogo = new Catalogo();
        catalogo.agregarEspecialista(e1);
        catalogo.agregarEspecialista(e3);
        catalogo.agregarPaciente(p1);
        catalogo.agregarPaciente(p3);
        catalogo.agregarCita(c1);
        catalogo.agregarCita(c3);
        catalogo.agregarCita(c4);
        System.out.println(catalogo);
        System.out.println();
        System.out.println("Se cancela c2 (igual a c1), se elimina p2 (igual a p1) y e2 (igual a e1):");
        catalogo.cancelarCita(c2);
        catalogo.eliminarPaciente(p2);
        catalogo.eliminarEspecialista(e2);
        System.out.println(catalogo);
    }
}