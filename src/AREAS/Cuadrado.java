package AREAS;

public class Cuadrado {
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public double area() {
		double resultado;
		resultado = lado *4;
		return resultado;
	}
	public double perimeroC() {
		double resultado;
		resultado = lado * 4;
		return resultado;
	}
}
