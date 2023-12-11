package AREAS;

public class Rectangulo {
	private int base;
	private int altura;
	
	
	
	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public double perimetro() {
		double resultado;
		resultado = (base*2)+(altura*2);
		return resultado;
	}
}
