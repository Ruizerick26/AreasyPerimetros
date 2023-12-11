package AREAS;

public class Testcuadrado {
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(0);
		Cuadrado c2 = new Cuadrado(0);
		Cuadrado c3 = new Cuadrado(0);
		c1.setLado(3);
		c2.setLado(5);
		c3.setLado(6);
		double resultadoc11 = c1.area();
		double resultadoc12 = c1.perimeroC();
		double resultadoc21 = c2.area();
		double resultadoc22 = c2.perimeroC();
		double resultadoc31 = c3.area();
		double resultadoc32 = c3.perimeroC();
		System.out.println("El área y perimetro del C1 es: " +resultadoc11 + " y " + resultadoc12);
		System.out.println("El área y perimetro del C2 es: " +resultadoc21 + " y " + resultadoc22);
		System.out.println("El área y perimetro del C3 es: " +resultadoc31 + " y " + resultadoc32);
	}
}
