package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	 Persona p1 = new Profesor();
	 Persona p2 = new Alumno();
	 
	 //ARRAYS
	 //Definicion
	 String [] dias = new String [7];
	 
	 //Dar valor
	 dias [0] = "Lunes";
	 
	 //Obtener el valor
	 System.out.println(dias [0]);
	 
	 //obtener dimension del array
	 System.out.println(dias.length);
	 
	 //recorrer
	 for (int i=0;i<dias.length;i++) {
	 System.out.println(dias[i]);
	 
	}
	//Ampliar NO se puede
	
	//ARRAYLIST -implementa la interfaz List con lo que es un Iterable, Collection y List
	//Definicion
	ArrayList<String> lista = new ArrayList<String>();
  
    
   //Dar valor
	lista.add("Alberto");
	
	//obtener el valor
	System.out.println("lista.get(0)");
	
	//Eliminar el valor
	lista.remove(0);
	
	//obtener la dimension
	System.out.println(lista.size());
	
    for (int i=0;i<lista.size();i++) {
	System.out.println(lista.get(i));
    }
}
}

