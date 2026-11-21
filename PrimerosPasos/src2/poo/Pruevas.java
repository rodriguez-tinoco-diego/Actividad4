package poo;

public class Pruevas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados tra=new Empleados("Ana");
		Empleados tra1=new Empleados("Pepe");
        Empleados tra2=new Empleados("lola");
		tra.cambiaSeccion("RCH");
		
		System.out.println(tra.devuelveDatos()+"\n"+tra1.devuelveDatos()+
				"\n"+tra2.devuelveDatos());
		
        System.out.println(Empleados.getIdSiguiente());


	}

}

class Empleados{
	
	public Empleados(String nombre) {
		this.nombre=nombre;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}
 
	
	public String devuelveDatos() {
		return "El nombre es: "+ nombre+ " y la seccion es: "+seccion
				+" la ID: "+id;
	}
	
	public static String getIdSiguiente() {
		 return "El id siguiente es: "+idSiguiente;		
	}
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
}
