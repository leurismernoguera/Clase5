package carrito;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class CarritoTest {

	@Test
	void testCostoFinalDescuentoFijo() {
		Producto producto1= new Producto( "Jabon","123f", 200);
		Producto producto2= new Producto( "Esponja", "124f",100);
		Producto producto3= new Producto( "Chocolatina", "125f",400);
		
		Carrito micarrito = new Carrito (producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
		Descuento desfijo= new DescuentoFijo(400);
		float valorFinal= micarrito.costofinal(desfijo);
		assertEqual(valorFinal,400);
	}
	private void assertEqual(float valorFinal, int i) {
	
		
	}
	@Test
	void testCostoFinalDescuentoPorcentaje() {
		Producto producto1= new Producto( "Jabon","123f", 200);
		Producto producto2= new Producto( "Esponja", "124f",100);
		Producto producto3= new Producto( "Chocolatina", "125f",400);
		
		Carrito micarrito = new Carrito (producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
		Descuento desfijo= new DescuentoPorcentaje(0.5F);
		float valorFinal= micarrito.costofinal(desporcentajeconTope);
		assertEqual(valorFinal,400);
		
	}
	@Test
	void testCostoFinalDescuentoPorcentajeConTope() {
		Producto producto1= new Producto( "Jabon","123f", 200);
		Producto producto2= new Producto( "Esponja", "124f",100);
		Producto producto3= new Producto( "Chocolatina", "125f",400);
		
		Carrito micarrito = new Carrito (producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
		Descuento desporcentaje= new DescuentoPorcentajeConTope(0.5F);
		
		desporcentaje.setValorDesc(0.20F);
		
		float valorFinal= micarrito.costofinal(desporcentaje);
		assertEqual(valorFinal,400);
		
	}

}
