package model;

public class Persona {
	public String nombre;
	public int edad;
	public float altura;
	public Coche coche;

	public Persona(String nombre, int edad, float altura, Coche coche) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.coche = coche;
	}

	public Persona(Persona personaACopiar) {
		this.altura=personaACopiar.altura;
		
	}
	
	// metodos: arrancar, repostar, chocar
	public void arrancar() {
		System.out.println(this.nombre+" est� intentando arrancar.");
		this.coche.arrancar();
	}

	public void repostar() {
		System.out.println("Repostando");

	}

	/**
	 * 
	 * @author Mikel
	 * @param p Recibe la persona y se chocar� contra su coche
	 * @return devuelve blabla
	 */
	public void chocar(Persona otraPersona) {
		//this.coche.chocar(otraPersona.coche);
		
		this.coche.vida=this.coche.vida-otraPersona.coche.fuerza;
		otraPersona.coche.vida=otraPersona.coche.vida-this.coche.fuerza;
		
		//TODO:COMPROBAR MUERTES
		
		
		
		
	}

}
