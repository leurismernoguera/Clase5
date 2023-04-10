package carrito;


import java.time.LocalDateTime;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDateTime fechadenacimiento;
	private int edad;
	private Carrito carrito;
	
	public Persona(String nombre, String apellido, LocalDateTime fechadenacimiento, int edad, Carrito carrito) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.fechadenacimiento= fechadenacimiento;
		this.edad= edad;
		this.carrito=carrito;
	}
	public String getNombre() {
		return this.nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
				
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido= apellido;
		
	}
	public LocalDateTime getfechadenacimiento() {
		return this.fechadenacimiento;
		
	}
	public void setfechadenacimiento(LocalDateTime fechadenacimiento) {
		this.fechadenacimiento= fechadenacimiento;
		
	}
	public int getEdad() {
		return this.edad ;
	}
	public void setEdad(int edad) {
		this.edad= edad;
		
	}
	public Carrito getcarrito() {
		return this.carrito;
		
	}
	public void setcarrito(Carrito carrito) {
		this.carrito= carrito;
	}

}