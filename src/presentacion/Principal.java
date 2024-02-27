package presentacion;

import logica.Circulo;
import logica.Cuadrado;
import logica.Cubo;
import logica.Cuerpo;
import logica.Figura;
import logica.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Figura f;
		f = new Cuadrado(5);
		System.out.println(f.area());
		System.out.println(f.perimetro());
		
		f = new Cuadrado();
		f.setValor1(10);
		System.out.println(f.area());
		System.out.println(f.perimetro());
		
		f = new Circulo(5);
		System.out.println(f.area());
		System.out.println(f.perimetro());

		f = new Triangulo(5, 4);
		System.out.println(f.area());
		System.out.println(f.perimetro());
		
		Cuerpo c;
		c = new Cubo(5);
		System.out.println(c.volumen());
		
		
		
	}
}
