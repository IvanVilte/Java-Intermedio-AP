package Ejercicio1;

public abstract class Empleado {
	private int dni;
	private String nombre;
	private int edad;
	private int cantidadMesesTrabajando;
	
	public Empleado() {
		this.dni = 12345678;
		this.nombre = "Sin nombre";
	}
	public Empleado(int dni, String nombre, int edad, int cantidadMesesTrabajando) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.cantidadMesesTrabajando = cantidadMesesTrabajando;
	}
	public void EvaluarCantidadMesesTrabajados() {
		if (this.cantidadMesesTrabajando < 3) {
			System.out.println("Se encuentra en etapa de prueba");
		} else {
			System.out.println("Se encuentra fijo en la empresa");
		}
	}
	public abstract void ObtenerInformacionParticularDelTrabajo();
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCantidadMesesTrabajando() {
		return cantidadMesesTrabajando;
	}
	public void setCantidadMesesTrabajando(int cantidadMesesTrabajando) {
		this.cantidadMesesTrabajando = cantidadMesesTrabajando;
	}
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", cantidadMesesTrabajando="
				+ cantidadMesesTrabajando + "]";
	}
}
