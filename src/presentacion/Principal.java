package presentacion;

import logica.Cilindro;
import logica.Circulo;
import logica.Cuadrado;
import logica.Cubo;
import logica.Cuerpo;
import logica.Esfera;
import logica.Figura;
import logica.Paralelepipedo;
import logica.Paralelogramo;
import logica.Piramide;
import logica.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Figura f;
		f = new Cuadrado(5);
		System.out.println(f.area());
		System.out.println(f.perimetro());
		
		/*f = new Cuadrado();
		f.setValor1(10);
		System.out.println(f.area());
		System.out.println(f.perimetro());*/
		
		f = new Circulo(5);
		System.out.println(f.area());
		System.out.println(f.perimetro());

		f = new Triangulo(5, 4);
		System.out.println(f.area());
		System.out.println(f.perimetro());
		
		f = new Paralelogramo(5,4,3);
		System.out.println(f.area());
		System.out.println(f.perimetro());
		
		Cuerpo c;
		c = new Cubo(5);
		System.out.println(c.volumen());
		
		c = new Esfera(5);
		System.out.println(c.volumen());
		
		c = new Cilindro(5,4);
		System.out.println(c.volumen());
		
		c = new Piramide(5,4);
		System.out.println(c.volumen());
		
		c = new Paralelepipedo(5,4,3);
		System.out.println(c.volumen());
	}
}
