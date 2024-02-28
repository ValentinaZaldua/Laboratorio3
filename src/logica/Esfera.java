package logica;

public class Esfera extends Circulo implements Cuerpo{

	public Esfera(double valor1) {
		super(valor1);
	}
	@Override
	public double volumen() {
		return 4 * Math.PI * Math.pow(valor1, 3);
	}

}

// V = 4/3 π r³
