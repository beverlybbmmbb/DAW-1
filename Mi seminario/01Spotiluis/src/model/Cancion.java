package model;
//comentarios

public class Cancion {
	// Atributos /variables -estas son las caracteristicas
	// que tienen todos los objetos-
	// TipoDato NombreVariable [= Valor];
	public String nombre;
	public String letra; // La letra completa
	public int duracion; // segundos

	// Constructores ( NombreClase(args .. )
	public Cancion() {

	}

	public Cancion(String nombre, String letra, int duracion) {

		//0. Validar datos
		if (duracion<=0) {
			System.out.println("Valor duración negativo ");
			duracion=100;
		}
		
		//1. Asignar datos
		this.nombre = nombre;
		this.letra = letra;
		this.duracion=duracion;

	}

	// Comportamientos / metodos
	// visibilidad retorno NombreMetodo ([argumentos])
	public void mostrarLetra() {
		System.out.println(this.letra);
	}

}
