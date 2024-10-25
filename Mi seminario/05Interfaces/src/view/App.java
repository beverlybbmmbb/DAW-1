package view;
/*
 * INTERFACES
 * Pueden ser public o package.
 * Se usa implements en lugar de extends.
 * Las interfaces entre ellas, SI QUE HACEN EXTENDS (un interfaz puede heredar una interfaz pero hay que usarlo en cosas basicas)
 * Todos sus metodos son public abstract y los atributos final static.
 * 
 * */
import model.Drone;
import model.iAeronave;
import model.iEspacial;
public class App {

	public static void main(String[] args) {
		Drone d = new Drone ();
		d.volar();
		d.orbitar();  
		
		//Comportamientos de vehiculo espacial
		iEspacial dEspacial = d;
		dEspacial.orbitar();
		System.out.println(dEspacial.velocidad);
		
		//Comportamientos de vehiculo espacial
		iAeronave dAeronave = d;
		dAeronave.volar();
		System.out.println(dAeronave.velocidad);

		 
                                                                                                                                           
	}

}
