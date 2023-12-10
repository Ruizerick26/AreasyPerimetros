package AREAS;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		r1.base = 4;
		r1.altura =2;
		double resultado1 = r1.perimetro();
		System.out.println("El resultado de R1 es: "+resultado1);
		r2.base = 5;
		r2.altura =3;
		double resultado2 = r2.perimetro();
		System.out.println("El resultado de R1 es: "+resultado2);
		
	}
}
