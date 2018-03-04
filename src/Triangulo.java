
public class Triangulo extends Poligono {
	private double posicao1;
	private double posicao2;
	public Triangulo(double base,double altura,double posicao1,double posicao2) {
		super(base,altura);
		this.setPosicao1(posicao1);
		this.setPosicao2(posicao2);
	}
	
	public double getPosicao1() {
		return posicao1;
	}
	public void setPosicao1(double posicao1) {
		this.posicao1 = posicao1;
	}
	public double getPosicao2() {
		return posicao2;
	}
	public void setPosicao2(double posicao2) {
		this.posicao2 = posicao2;
	}
	@Override
    public double area(){
		return (getBase()*getAltura())/2;
   	 
    }
   
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return posicao1 + posicao2 + getBase() ;
	}

	@Override
	public double volume() {
		
		return 0;
	}

}
