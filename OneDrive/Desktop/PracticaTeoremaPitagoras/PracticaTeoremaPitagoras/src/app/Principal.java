package app;

import Clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		TrianguloRectangulo primero = new TrianguloRectangulo(2,4);
		
		TrianguloRectangulo segundo = new TrianguloRectangulo();
		
		int areaPrimero = primero.area();
		int areaSegundo = segundo.area();
		
		double perimetroPrimero = primero.perimetro();
		double perimetroSegundo = segundo.perimetro();

		double hipotenusaPrimero = primero.hipotenusa();
		double hipotenusaSegundo = segundo.hipotenusa();

		primero.area();
		primero.perimetro();
		primero.hipotenusa();
		
		
		segundo.area();
		segundo.perimetro();
		segundo.hipotenusa();
		
		
		System.out.print("metodos realizados");

	}
	
	

}
