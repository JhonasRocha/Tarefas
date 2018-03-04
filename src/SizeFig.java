
public class SizeFig extends Figura {
	private double comprimento;
	private double altura;
	private double largura;
	

	public SizeFig(double comprimento, double altura, double largura) {
		super();
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
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
