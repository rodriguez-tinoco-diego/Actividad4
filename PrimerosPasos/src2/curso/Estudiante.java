package curso;

public class Estudiante extends Persona implements Comparable<Estudiante> {

    private double promedio;

    public Estudiante(String nombre, double promedio) {
        super(nombre); // llama al constructor de Persona
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    // Sobrescritura de presentarse() (polimorfismo)
    @Override
    public String presentarse() {
        return "Soy el estudiante " + nombre + " con promedio " + promedio;
    }

    /**
     * Ordena de MAYOR a MENOR por promedio.
     * Al invertir los argumentos, el mayor queda primero.
     */
    @Override
    public int compareTo(Estudiante otro) {
        return Double.compare(otro.promedio, this.promedio);
    }

    @Override
    public String toString() {
        return presentarse();
    }
}