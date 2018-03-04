
public abstract class Poligono extends Figura {
	private double base;
	private double altura;
	 

	 public Poligono(double base,double altura) {
		 
		 this.base=base;
		 this.altura= altura;
		 
	 }
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
