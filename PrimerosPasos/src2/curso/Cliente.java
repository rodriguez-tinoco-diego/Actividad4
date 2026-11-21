package curso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombrePropio;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String curp;
    private List<Consulta> consultas;

    public Cliente(String nombrePropio, String apellidoPaterno, String apellidoMaterno,
                    LocalDate fechaNacimiento, String direccion, String telefono, String curp) {
        this.nombrePropio = nombrePropio;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.curp = curp;
        this.consultas = new ArrayList<>();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void addConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public String getNombrePropio() {
        return nombrePropio;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCurp() {
        return curp;
    }

    public Consulta getConsulta(int posicion) {
        return consultas.get(posicion);
    }
}