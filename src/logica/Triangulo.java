package logica;

public class Triangulo extends Figura {
	private double valor2;

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public Triangulo(double valor1, double valor2) {
		super(valor1);		
		this.valor2 = valor2;
	}
	
	public Triangulo() {
		super();
		this.valor2 = 0;
	}

	@Override
	public double area() {
		return this.valor1 * this.valor2 / 2;
	}

	@Override
	public double perimetro() {
		return this.valor1 + this.valor2 + Math.sqrt(Math.pow(this.valor1, 2) + Math.pow(this.valor2, 2));
	}

}
