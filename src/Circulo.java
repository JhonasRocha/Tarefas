
public class Circulo extends Figura {
	 double raio;
	 double perimetro;
		public Circulo(double raio) {
			this.raio=raio;
			
	 }

	    public double getRaio() {
			return raio;
		}

		public void setRaio(double raio) {
			this.raio = raio;
		}
	@Override
		public double perimetro() {
			return 2*Math.PI*getRaio();
		}
	@Override
	    public double area() {
		
		    return Math.PI*getRaio();
	}

	@Override
	    public double volume() {
		
		    return 0;
	}
}
