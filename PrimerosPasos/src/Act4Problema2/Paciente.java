package Act4Problema2;

import java.time.LocalDate;

public class Paciente extends Persona {

    private LocalDate fechaNacimiento;
    private String direccion;

    public Paciente(String nombre, String telefono, LocalDate fechaNacimiento, String direccion) {
        super(nombre, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Paciente [" + super.toString() + ", fechaNacimiento=" + fechaNacimiento
                + ", direccion=" + direccion + "]";
    }
}