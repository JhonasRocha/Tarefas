
public class Cubo extends SizeFig {
	public Cubo(double comprimento,double largura,double altura ) {
	super(comprimento,largura,altura);
	}
	@Override
    public double area(){
		return Math.pow(getComprimento(), 2)*4;
   	 
    }
	@Override
    public double perimetro() {
		return 12*getComprimento();
	}
	@Override
	public double volume() {
		
		return Math.pow(getComprimento(), 3) ;
	}

}

