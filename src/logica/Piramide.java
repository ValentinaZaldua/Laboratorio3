package logica;

public class Piramide extends Triangulo implements Cuerpo {
	
	public Piramide (double valor1, double valor2) {
		super (valor1, valor2);
	}
	
	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return (Math.pow(valor1, 2) * valor2) /3;
	}
	

}

// V= (L*L*h)/3
