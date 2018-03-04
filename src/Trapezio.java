
public class Trapezio extends Poligono {
	private double base_menor;
	private double sideA;
	private double sideB;
	public Trapezio(double base, double altura, double base_menor, double sideA, double sideB) {
		super(base, altura);
		this.base_menor = base_menor;
		this.sideA = sideA;
		this.sideB = sideB;
	}
	public double getBase_menor() {
		return base_menor;
	}
	public void setBase_menor(double base_menor) {
		this.base_menor = base_menor;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
}
