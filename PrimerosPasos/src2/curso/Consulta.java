package curso;

import java.time.LocalDate;

public class Consulta {

    private LocalDate fechaConsulta;
    private String diagnostico;
    private String receta;

    public Consulta(LocalDate fechaConsulta, String diagnostico, String receta) {
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getReceta() {
        return receta;
    }
}