import java.util.*;
public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			ArrayList<Figura> figura = new ArrayList<>();
			figura.add(new Triangulo(4.0,2.0,3.0,7.0));
			figura.add(new Losango(6.0,3.0));
			figura.add(new Retangulo(5.0,8.4));
			figura.add(new Quadrado(4.0,2.0));
			figura.add(new Trapezio(4.9,9.4,5.6,3.3,4.1));
			figura.add(new Cubo(6.4,7.1,5.4));
			figura.add(new Esfera(2.2,2.2,5.6));
			figura.add(new Piramide(9.2,2.4,7.9));
			figura.add(new Cilindro(3.2,3.2,6.6));
			 
			for(Figura figura1:figura){
				 System.out.println(figura1.area());
				 System.out.println(figura1.perimetro());
				 System.out.println(figura1.volume());
				 if(figura1 instanceof Diagonal){
				 System.out.println(((Diagonal)figura1).diagonal());
				 }
			 }
		 }
	

}
