package curso;

public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método que puede ser sobrescrito (polimorfismo)
    public String presentarse() {
        return "Hola, soy " + nombre;
    }

    @Override
    public String toString() {
        return presentarse();
    }
}