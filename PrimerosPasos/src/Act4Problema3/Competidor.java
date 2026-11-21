package Act4Problema3;

import java.time.Duration;

public class Competidor extends Persona {

    private int numero;
    private Categoria categoria;
    private boolean culmino;
    private Duration tiempo;
    private boolean topDiez;

    public Competidor(String nombreCompleto, String genero, Categoria categoria) {
        super(nombreCompleto, genero);
        this.categoria = categoria;
    }

    // Lo usa el Catalogo al registrar al competidor (el sistema asigna el numero)
    void asignarNumero(int numero) {
        this.numero = numero;
    }

    public void registrarResultado(boolean culmino, Duration tiempo, boolean topDiez) {
        this.culmino = culmino;
        this.tiempo = tiempo;
        this.topDiez = topDiez;
    }

    @Override
    public String toString() {
        return "Competidor [" + super.toString() + ", numero=" + numero + ", categoria=" + categoria
                + ", culmino=" + culmino + ", tiempo=" + tiempo + ", topDiez=" + topDiez + "]";
    }
}