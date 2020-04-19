package aplicacion;
import modal.entidades.Circulo;
import modal.entidades.Rectangulo;
import modal.entidades.Figuras;
import modal.enums.Color;

public class Principal {

	public static void main(String[] args) {
       Figuras fc = new Circulo(Color.BLANCO, 2.0);
       Figuras fr = new Rectangulo(Color.NEGRO, 3.0, 4.0);
       
       System.out.println("---Datos del Circulo");
       System.out.println("   *-Color :"+fc.getColor());
       System.out.println("   *-Area  :"+String.format("%.2f",fc.area())+"\n");       

       System.out.println("---Datos del Rectangulo");
       System.out.println("   *-Color :"+fr.getColor());
       System.out.println("   *-Area  :"+String.format("%.2f",fr.area())+"\n");       

	}

}
