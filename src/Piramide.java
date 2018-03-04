
public class Piramide extends SizeFig {

	public Piramide(double comprimento, double altura, double largura) {
		super(comprimento, altura, largura);
		// TODO Auto-generated constructor stub
	}
	@Override
    public double area(){
		return Math.sqrt(3)*Math.pow(getComprimento(), 2);
   	 
    }
	@Override
    public double perimetro() {
		return 12*getComprimento();
	}
	@Override
	public double volume() {
		
		return (1/3)*getComprimento()*getLargura()*getAltura() ;
	}
}
