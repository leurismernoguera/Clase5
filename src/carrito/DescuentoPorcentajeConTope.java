package carrito;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

	private float tope;

	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope=tope;
		
	}
	public float getTope() {
		return this. tope;
	}
	public void setTope(float valor) {
		this.tope= valor;
	}
	@Override
	public void setValorDesc(float valor) {
		if(valor>this.tope) {
			super.setValorDesc(0);
			System.out.println("El valor supera el Tope");
		}else {
			super.setValorDesc(valor);
		}
	}
}
