package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
		Empleado em1=new Empleado("paco",83230,1990,12,17);
		Empleado em2=new Empleado("maria",56230,1993,02,07);
		Empleado em3=new Empleado("loco",34530,1994,10,12);
		
		em1.subirSueldo(5);
		em2.subirSueldo(5);
		em3.subirSueldo(5);
		 
		System.out.println("nombre:"+ em1.getNombre()+" sueldo:"+em1.getSueldo()+" fecha de alta de la empresa:"+em1.getAltaContrato());
		System.out.println("nombre:"+ em2.getNombre()+" sueldo:"+em2.getSueldo()+" fecha de alta de la empresa:"+em2.getAltaContrato());
		System.out.println("nombre:"+ em3.getNombre()+" sueldo:"+em3.getSueldo()+" fecha de alta de la empresa:"+em3.getAltaContrato());
*/
		Empleado [] misEmpleados=new Empleado[3];
		misEmpleados[0]=new Empleado("paco",83230,1990,12,17);
		misEmpleados[1]=new Empleado("maria",56230,1993,02,07);
		misEmpleados[2]=new Empleado("loco",34530,1994,10,12);
		
		//for(int i=0;i<3;i++) {
		  for(Empleado e:misEmpleados) {	
			e.subirSueldo(5);
		}
		//for(int i=0;i<3;i++) {
		  for(Empleado e:misEmpleados) {
			System.out.println("nombre:"+ e.getNombre()
					+" sueldo:"+ e.getSueldo()
					+" fecha de alta de la empresa:"+ e.getAltaContrato());
		}
	}

}


class Empleado{
	
	public Empleado(String nombre, double sueldo, int agnio, int mes, int dia) {
		
		this.nombre=nombre;
		this.sueldo=sueldo;
		GregorianCalendar calendario=new GregorianCalendar(agnio,mes-1,dia);
		altaContrato=calendario.getTime();
		
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public Date getAltaContrato() {
		return altaContrato;
	}
	public void subirSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}