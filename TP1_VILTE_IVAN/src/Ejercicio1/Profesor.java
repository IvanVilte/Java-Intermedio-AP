package Ejercicio1;

public class Profesor extends Empleado{
	private String cargo;
	private boolean esProfesorOAyudante;
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public boolean isEsProfesorOAyudante() {
		return esProfesorOAyudante;
	}
	public void setEsProfesorOAyudante(boolean esProfesorOAyudante) {
		this.esProfesorOAyudante = esProfesorOAyudante;
	}
	public Profesor() {
		super();
	}
	public Profesor(int dni, String nombre, int edad, int cantidadMesesTrabajando, String cargo, boolean esProfesorOAyudante) {
		super(dni, nombre, edad, cantidadMesesTrabajando);
		this.cargo = cargo;
		this.esProfesorOAyudante = esProfesorOAyudante;
	}
	@Override
	public void ObtenerInformacionParticularDelTrabajo() {
		System.out.println("Los profesores suelen trabajar dando clases en secundarios, terciarios o universitarios");
	}
	@Override
	public String toString() {
		return super.toString() + " " + "Profesor [cargo=" + cargo + ", esProfesorOAyudante=" + esProfesorOAyudante + "]";
	}
}
