package carrito;

public class Producto {
	float precio;
	String nombre;
	String codigo;
	
	float costofinal;
	
	public Producto(String nombre, String codigo, float precio) {
		
		this.precio= precio;
		this.nombre= nombre;
		this.codigo= codigo;
				
	}
	public String getnombre() {
		
		return this.nombre;
	}
	public void setnombre(String nombre) {
		this.nombre= nombre;
		
	}
	public String getcodigo() {
		
		return this.codigo;
	}
	public void setcodigo(String codigo) {
		this.codigo= codigo;
				
	}
	
		
		
	public void setprecio(float precio) {
		this.precio= precio;
		
	}
	public float costofinal() {
		
		return this.precio;
	}
	
		
		
	}
