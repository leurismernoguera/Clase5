package carrito;

import java.time.LocalDateTime;

public class Carrito {
	public Producto producto1;
	public Producto producto2;
	public Producto producto3;
	public LocalDateTime fechadecompra;
	
	
	public  Carrito (Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechadecompra) {
		this.producto1=producto1;
		this.producto2=producto2;
		this.producto3=producto3;
		this.fechadecompra=fechadecompra;
		
			
				
	}
	public Producto getProducto1() {
		return this.producto1;
		
	}
	public void setProducto1(Producto producto1) {
		this.producto1= producto1;
		
	}
	public Producto getProducto2() {
		return this.producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2= producto2;
		
	}
	public Producto getProducto3() {
		return this.producto3;
		
	}
	public void setProducto3(Producto producto3) {
		this.producto3= producto3;
				
	}
	public LocalDateTime getFechadecompra() {
		return this.fechadecompra;
	}
	public void setFechadecompra(LocalDateTime fechadecompra) {
		this.fechadecompra= fechadecompra;		
		
	}
	public float costofinal(Descuento desc) throws ValorCeroException, TotalNegativoException{
	float total= desc.valorFinal(producto1.costofinal()+ this.producto2.costofinal()+ this.producto3.costofinal());
		return  total;
	}	
	}