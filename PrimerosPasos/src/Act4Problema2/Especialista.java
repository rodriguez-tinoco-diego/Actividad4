package Act4Problema2;


public class Especialista extends Persona {

    private String especialidad;
    private String cedulaProfesional;
    private String email;

    public Especialista(String nombre, String especialidad, String cedulaProfesional,
                        String telefono, String email) {
        super(nombre, telefono);
        this.especialidad = especialidad;
        this.cedulaProfesional = cedulaProfesional;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Especialista [" + super.toString() + ", especialidad=" + especialidad
                + ", cedulaProfesional=" + cedulaProfesional + ", email=" + email + "]";
    }
}