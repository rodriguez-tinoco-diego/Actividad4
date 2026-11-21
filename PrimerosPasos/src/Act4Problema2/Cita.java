package Act4Problema2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Cita implements Comparable<Cita> {

    private LocalDate fecha;
    private LocalTime hora;
    private Especialista especialista;
    private Paciente paciente;

    public Cita(LocalDate fecha, LocalTime hora, Especialista especialista, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.especialista = especialista;
        this.paciente = paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cita otra = (Cita) o;
        return Objects.equals(fecha, otra.fecha)
                && Objects.equals(hora, otra.hora)
                && Objects.equals(especialista, otra.especialista)
                && Objects.equals(paciente, otra.paciente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, hora, especialista, paciente);
    }

    @Override
    public String toString() {
        return "Cita [fecha=" + fecha + ", hora=" + hora
                + ",\n     " + especialista + ",\n     " + paciente + "]";
    }

    @Override
    public int compareTo(Cita otra) {
        int resultado = fecha.compareTo(otra.fecha);
        if (resultado != 0) {
            return resultado;
        }
        resultado = hora.compareTo(otra.hora);
        if (resultado != 0) {
            return resultado;
        }
        resultado = especialista.compareTo(otra.especialista);
        if (resultado != 0) {
            return resultado;
        }
        return paciente.compareTo(otra.paciente);
    }
}