package curso;

import java.util.ArrayList;
import java.util.List;

// CLASE AUTOR
class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.setNacionalidad(nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}

// CLASE PADRE ACTUALIZADA
class Publicacion {
    protected String titulo;
    protected Autor autor;
    protected int anioPublicacion;
    protected String edicion;
    protected String editorial;
    protected double precioBase;

    public Publicacion(String titulo, Autor autor, int anioPublicacion, String edicion, String editorial, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.edicion = edicion;
        this.editorial = editorial;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase;
    }

    public void mostrarDetalle() {
        System.out.println("Título: " + titulo + " (" + anioPublicacion + ")" +
                           "\n   Autor: " + autor.getNombre() +
                           " | Edición: " + edicion +
                           " | Editorial: " + editorial +
                           "\n   Precio Final: $" + String.format("%.2f", calcularPrecioFinal()) + "\n");
    }
}

// CLASE HIJA 1: LIBRO FÍSICO
class LibroFisico extends Publicacion {
    private double costoEnvio;

    public LibroFisico(String titulo, Autor autor, int anioPublicacion, String edicion, String editorial, double precioBase, double costoEnvio) {
        super(titulo, autor, anioPublicacion, edicion, editorial, precioBase);
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + costoEnvio;
    }
}

// CLASE HIJA 2: LIBRO DIGITAL
class LibroDigital extends Publicacion {
    private double porcentajeDescuento;

    public LibroDigital(String titulo, Autor autor, int anioPublicacion, String edicion, String editorial, double precioBase, double porcentajeDescuento) {
        super(titulo, autor, anioPublicacion, edicion, editorial, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioFinal() {
        double descuento = precioBase * (porcentajeDescuento / 100);
        return precioBase - descuento;
    }
}

// CLASE PRINCIPAL CON LOS 10 OBJETOS INSTANCIADOS
public class Libreria {
    public static void main(String[] args) {
        // 1. Instanciamos los autores (reutilizamos a García Márquez)
        Autor marquez = new Autor("Gabriel García Márquez", "Colombiano");
        Autor cervantes = new Autor("Miguel de Cervantes", "Español");
        Autor orwell = new Autor("George Orwell", "Británico");
        Autor exupery = new Autor("Antoine de Saint-Exupéry", "Francés");
        Autor rulfo = new Autor("Juan Rulfo", "Mexicano");
        Autor cortazar = new Autor("Julio Cortázar", "Argentino");
        Autor zafon = new Autor("Carlos Ruiz Zafón", "Español");
        Autor borges = new Autor("Jorge Luis Borges", "Argentino");
        Autor bradbury = new Autor("Ray Bradbury", "Estadounidense");

        // 2. Creamos la lista polimórfica de publicaciones
        List<Publicacion> catalogo = new ArrayList<>();

        // 3. Instanciamos los 10 libros (alternando físicos y digitales)
        catalogo.add(new LibroFisico("Cien años de soledad", marquez, 1967, "1.ª edición", "Editorial Sudamericana", 22.00, 5.00));
        catalogo.add(new LibroFisico("Don Quijote de la Mancha", cervantes, 1605, "Edición conmemorativa", "Real Academia Española", 30.00, 6.50));
        catalogo.add(new LibroDigital("1984", orwell, 1949, "1.ª edición", "Secker & Warburg", 14.00, 15.0));
        catalogo.add(new LibroDigital("El Principito", exupery, 1943, "1.ª edición", "Reynal & Hitchcock", 12.00, 20.0));
        catalogo.add(new LibroFisico("Pedro Páramo", rulfo, 1955, "1.ª edición", "Fondo de Cultura Económica", 18.00, 4.00));
        catalogo.add(new LibroFisico("Rayuela", cortazar, 1963, "1.ª edición", "Editorial Sudamericana", 24.00, 5.00));
        catalogo.add(new LibroDigital("La sombra del viento", zafon, 2001, "1.ª edición", "Editorial Planeta", 16.50, 10.0));
        catalogo.add(new LibroFisico("Crónica de una muerte anunciada", marquez, 1981, "1.ª edición", "Editorial La Oveja Negra", 17.00, 4.50));
        catalogo.add(new LibroDigital("Ficciones", borges, 1944, "1.ª edición", "Editorial Sur", 13.50, 15.0));
        catalogo.add(new LibroFisico("Fahrenheit 451", bradbury, 1953, "1.ª edición", "Ballantine Books", 19.00, 4.50));

        // 4. Recorremos e imprimimos todo el catálogo
        System.out.println("=== CATÁLOGO DE LA LIBRERÍA (" + catalogo.size() + " LIBROS) ===\n");
        for (Publicacion libro : catalogo) {
            libro.mostrarDetalle();
        }
    }
}