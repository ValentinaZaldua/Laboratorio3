package logica;

public class Paralelogramo extends Cuadrado {
	private double valor2;
	private double valor3;

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}

	public Paralelogramo(double valor1, double valor2, double valor3) {
		super(valor1);
		this.valor2=valor2;
		this.valor3=valor3;
	}

	@Override
	public double area() {
		return valor1 * valor2;
	}
	
	@Override
	public double perimetro() {
		return 2*(valor1 + valor3);
	}

	
}

// A = bh
// P = 2 (a + b)