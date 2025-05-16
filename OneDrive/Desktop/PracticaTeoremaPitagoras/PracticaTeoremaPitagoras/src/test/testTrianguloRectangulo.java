package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	@Test	
	void testArea1() {
		TrianguloRectangulo primero = new TrianguloRectangulo(2,4);
		double areaEsperado = 4;
		double areaObtenido = primero.area();
		assertEquals(areaEsperado,areaObtenido);
	}

	@Test
	void testArea2() {
		TrianguloRectangulo segundo = new TrianguloRectangulo();
		double areaEsperado = 0;
		double areaObtenido = segundo.area();
		assertEquals(areaEsperado,areaObtenido);
	}

	/*@Test
	void testArea3() {
		TrianguloRectangulo tercero = new TrianguloRectangulo(0,20);
		double areaEsperado = 1;
		double areaObtenido = tercero.area();
		assertEquals(areaEsperado,areaObtenido);
	}

	@Test
	void testPerimetro1() {
		TrianguloRectangulo primero = new TrianguloRectangulo(2,4);
		double perimetroEsperado = 10;
		double perimetroObtenido = primero.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}

	@Test
	void testPerimetro2() {
		TrianguloRectangulo segundo = new TrianguloRectangulo();
		double perimetroEsperado = 3;
		double perimetroObtenido = segundo.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
		
	}

	@Test
	
		void testPerimetro3() {
			TrianguloRectangulo tercero = new TrianguloRectangulo(0,20);
			double perimetroEsperado = 0;
			double perimetroObtenido = tercero.perimetro();
			assertEquals(perimetroEsperado,perimetroObtenido);
			
		}

	@Test
	void testHipotenusa1() {
		TrianguloRectangulo primero = new TrianguloRectangulo(2,4);
		double hipotenusaEsperado = 4;
		double hipotenusaObtenido = primero.hipotenusa();
		assertEquals(hipotenusaEsperado,hipotenusaObtenido);
		
	}

	@Test
	void testHipotenusa2() {
		TrianguloRectangulo segundo = new TrianguloRectangulo();
		double hipotenusaEsperado = 1;
		double hipotenusaObtenido = segundo.hipotenusa();
		assertEquals(hipotenusaEsperado,hipotenusaObtenido);
		
	}

	@Test
	void testHipotenusa3() {
		TrianguloRectangulo tercero = new TrianguloRectangulo(0,20);
		double hipotenusaEsperado = 1;
		double hipotenusaObtenido = tercero.hipotenusa();
		assertEquals(hipotenusaEsperado,hipotenusaObtenido);
		
	}*/



}
