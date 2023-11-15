package Ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Empleado profesor = new Profesor(398952, "Iván Felipe Vilte", 27, 2, "Docente", true);
		
		System.out.println(profesor);
		profesor.EvaluarCantidadMesesTrabajados();
		
		Empleado empleado = new Profesor();
		empleado.toString();
		empleado.ObtenerInformacionParticularDelTrabajo();	
	}
}