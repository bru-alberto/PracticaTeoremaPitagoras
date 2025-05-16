package Clases;

/**
 * Clase para obtener Area y Perimetro de un triangulo
 */
public class TrianguloRectangulo {
	
	/**
	 * Las variables a y b  son dos catetos y la variable c la hipotenusa
	 */
	int a;
	int b;
	double c;
	
	
	/**
	 * Creamos un constructor por defecto
	 */
	
	public TrianguloRectangulo() {
		this.a=1;
		this.b=1;
		
	}
	
	
	
	public TrianguloRectangulo(int a,int b) {
		
		/**
		 * Se crea el constructor de triangulo pasando dos catetos por parametro
	     * @throws IllegalArgumentException Si el número es menor o igual que 0.
		 */
		
		
		if (a <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor que 0");
        }
		
		if (b <= 0) {
            throw new IllegalArgumentException("El número debe ser  que 0");
        }
		
		this.a= a;
		this.b=b;
		this.c=Math.sqrt(a*a)+(b*b);
		
	}
	
	
	
		public int area() {
			/**
			 * Calcular el area de un triangulo multiplicando los dos primeros cateteos por 
			 * parametro entre dos
			 * @return area
			 */
			
			int area=(a*b)/2;
			
			return area;
		}
		
		public double hipotenusa() {
			/**
			 * Creamos el metodo de hipotenusa
			 * @return c (hipotenusa calculado en constructor)
			 */
			
			return c;
		}
		
		/**
		 * Creamos el metodo perimetro
		 * @return perimetro
		 */
		
		public double perimetro() {
			
			double perimetro = a+b+c;
			
			return perimetro;
			
		}
		/**
		 * Creamos metodos SET Y GET para la variable A
		 * @return A
		 */
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		
		
		/**
		 * Creamos metodos GET Y SET para la variable B
		 * @return B
		 */
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		
		public double getC() {
			return c;
		}
		public void setC(double c) {
			this.c = c;
		}
		
		
		public String toString() {
			
			String res = "";
			
			res+= "Primer cateto"+this.a+"\n";
			res+= "Segundo cateto"+this.b+"\n";
			res+= "Hipotenusa"+this.c+"\n";
			
			
			
			return res;
		}

}
