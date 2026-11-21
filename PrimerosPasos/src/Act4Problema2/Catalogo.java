package Act4Problema2;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Especialista> listaEspecialistas;
    private List<Paciente> listaPacientes;
    private List<Cita> listaCitas;

    public Catalogo() {
        listaEspecialistas = new ArrayList<>();
        listaPacientes = new ArrayList<>();
        listaCitas = new ArrayList<>();
    }

    public void agregarEspecialista(Especialista especialista) {
        listaEspecialistas.add(especialista);
    }

    public void eliminarEspecialista(Especialista especialista) {
        listaEspecialistas.remove(especialista);
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        listaPacientes.remove(paciente);
    }

    public void agregarCita(Cita cita) {
        listaCitas.add(cita);
    }

    public void cancelarCita(Cita cita) {
        listaCitas.remove(cita); // busca la cita con equals
    }

    @Override
    public String toString() {
        String texto = "Especialistas (" + listaEspecialistas.size() + "):";
        for (Especialista e : listaEspecialistas) {
            texto = texto + "\n  " + e;
        }
        texto = texto + "\nPacientes (" + listaPacientes.size() + "):";
        for (Paciente p : listaPacientes) {
            texto = texto + "\n  " + p;
        }
        texto = texto + "\nCitas (" + listaCitas.size() + "):";
        for (Cita c : listaCitas) {
            texto = texto + "\n  " + c;
        }
        return texto;
    }
}