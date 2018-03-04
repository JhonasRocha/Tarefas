
public class Esfera extends SizeFig {

	public Esfera(double comprimento, double altura, double largura) {
		super(comprimento, altura, largura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area(){
	return 4*Math.PI*Math.pow(getComprimento()/2, 2) ;
	 
	}
	@Override
	public double perimetro() {
	return 2*Math.PI*(getComprimento()/2);
	}
	@Override
	public double volume() {
	
	return (4/3)*Math.PI*Math.pow(getComprimento()/2, 3) ;
	}

}
