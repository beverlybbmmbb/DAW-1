package model;

public class Piloto extends Persona{
	public String coche; 
		
	public void pilotar() {
		System.out.println("Broooom �iii �iii brooomn");
	}
	
	@Override
	public void saludar() {
		System.out.println("Te fundo �iiii");
	}
	
	//Sobrecarga (varios m�todos con el mismo nombre)
	public void saludar(String saludo) {
		System.out.println(saludo);
	}

}
