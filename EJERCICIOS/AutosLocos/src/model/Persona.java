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

	//metodos: arrancar, repostar, chocar
	public void arrancar() {
		System.out.println(this.nombre+" esta intendo arrancar.");
		this.coche.arrancar();
	}
	
	public void  repostar() {
		System.out.println("Repostando");
	}
	
	/**
	 * 
	 * @param Mikel
	 * @param p Recibe la persona y se chocara contra su coche 
	 * @return Devuelve el coche ganador/destruido
	 * 
	 */
	public void chocar(Persona otrapersona) {
		//this.coche.chocar(otrapersona.coche);
		
		this.coche.vida=this.coche.vida-otrapersona.coche.fuerza;
		otrapersona.coche.vida=otrapersona.coche.vida-this.coche.fuerza;
		
		//TODO:COMPROBAR MUERTES hacer un IF
		
	
	}
}
