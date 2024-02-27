package logica;

public class Circulo extends Figura {

	public Circulo(double valor1) {
		super(valor1);
	}
	
	public Circulo() {
		super();
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.valor1, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.valor1;
	}

}
