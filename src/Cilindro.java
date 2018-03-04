
public class Cilindro extends SizeFig {

	public Cilindro(double comprimento, double altura, double largura) {
		super(comprimento, altura, largura);
		// TODO Auto-generated constructor stub
	}
	@Override
    public double area(){
		return 2*Math.PI*(getComprimento()/2)*getAltura()+  2*Math.PI*Math.pow(getComprimento()/2, 2) ;
   	 
    }
	@Override
    public double perimetro() {
		return 2*Math.PI*(getComprimento()/2)*getAltura();
	}
	@Override
	public double volume() {
		
		return Math.pow(getComprimento()/2, 2)*getAltura()  ;
	}
}
