package model;

public class Coche {
	public String marca,modelo;
	private int vida;
	private int fuerza; 
	public int capacidadDeposito, combustible;
	public Coche(String marca, String modelo, int vida, int fuerza, int capacidadDeposito) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vida = vida;
		this.fuerza = fuerza;
		this.capacidadDeposito = capacidadDeposito;
		this.combustible=capacidadDeposito; //Lleno!
	}
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		if (fuerza<0) {
			this.fuerza=50;
		}
		this.fuerza=fuerza;
	}







	public void chocar() {
		//TODO: �qu� le pasa al coche?
		
		
	}

	public void arrancar() {
		//Validar combustible
		if (this.combustible>0) {
			//arrancar
			System.out.println("BROOOOOOOOOMMMMMM");
			//restar combustible
			this.combustible--;
		}else {
			//no arrancar
			System.out.println("No hay combustible :( ");
		}
			
			
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
