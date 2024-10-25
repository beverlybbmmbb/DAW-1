package view;

import model.Coche;
import model.Persona;

public class App {

	public static void main(String[] args) {
		
		
		/*Coche c1 = new Coche ("Porsche", "GT2 RS", 100, 60, 60);
		Persona p1 = new Persona("Vicente", 
				                  39,
				                  175,
		             new Coche ("Porsche", "GT2 RS", 100, 60, 60)
		                       );*/
		
		Persona p1 = new Persona("Vicente", 39, 175, new Coche ("Porsche", "GT2 RS", 100, 60, 60));
		Persona p2 = new Persona("Erlantz", 18, 173, new Coche ("Mustang", "GT", 100, 80, 60));
		p1.arrancar();
		p1.chocar(p2);
		
		p1.coche.setFuerza(-2);
		
		
		/*Coche c2 = new Coche ("Porsche", "GT2 RS", 100, 80, 60);
				Coche c3 = c2;
				System.out.println(c2.marca);
				c3.marca="Ferrari";
				System.out.println(c3.marca);
				System.out.println(c2.marca);
				System.out.println(c2);*/
		
        
	}

}
