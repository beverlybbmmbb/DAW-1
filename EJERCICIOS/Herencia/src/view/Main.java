package view;

import model.Futbolista;
import model.Persona;
import model.Piloto;

public class Main {

	public static void main(String[] args) {

		Persona p = new Persona();
		Futbolista f = new Futbolista();
		Piloto pi = new Piloto();
		
		f.saludar();//Polmorfismo (mismo metodo diferentes clases)
        p.saludar();
        
      /* Persona personita = new Futbolista();
       Futbolista fut = new Persona();*/
	}

}
