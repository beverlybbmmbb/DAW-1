package Estructura;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ESTRUCTURA CONTROL DE FLUJO

		// condicionales

		Scanner entrada = new Scanner(System.in);

		/*
		 * System.out.println("Introduce tu edad"); int edad = entrada.nextInt();
		 * 
		 * edad>=18 if(edad>=18) { System.out.println("Acceso permitido");
		 * 
		 * } else { System.out.println("Acceso denegado"); }
		 */
		/*
		 * if (edad >= 16 && edad <18) { System.out.println("Acceso permitido"); }
		 * 
		 * if (edad >=18) { System.out.println("Acceso denegado"); }
		 */

		/*
		 * if (edad >= 16 && edad <18) {
		 * System.out.println("Acceso permitido con tutor"); }else if (edad >=18) {
		 * System.out.println("Acceso permitido"); }else {
		 * System.out.println("Acceso denegado"); }
		 */

		/*
		 * System.out.println("Introduce la inicial del dia de la semana: "); String dia
		 * = entrada.next();
		 * 
		 * switch (dia) { case "l": System.out.println("Lunes"); break;//terminar un
		 * control de flujo case "m": System.out.println("Martes"); break; case "x":
		 * System.out.println("Miercoles"); break; case "j":
		 * System.out.println("Jueves"); break; case "v": System.out.println("Viernes");
		 * break; default: System.out.println("Dia no valido"); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //repetitivas - bucles (for, while, do..while)
		 * 
		 * /*for(inicializar las variables que vamos a poner en el for, condicion para
		 * que se ejecute el bucle;cadaVuelta Lo ultimo que se va a ejecutar en el for)
		 */

		/*
		 * for(int i=0;i<10;i++) { System.out.println("Mensaje"+ i); }
		 * 
		 * System.out.println("Introduce tu nombre: "); String nombre = entrada.next();
		 * 
		 * for (int i=0;i<nombre.length();i++){//i++ le suma 1 al final//
		 * System.out.println(nombre.charAt(i)); }
		 */

		/*
		 * PONER EL NOMBRRE AL REVES System.out.println("Introduce tu nombre: "); String
		 * nomb = entrada.next();
		 * 
		 * for (int i=nombre.length()-1;i>=0;i--){ //para ue el nombre te lo diga al
		 * reves// System.out.println(nomb.charAt(i)); }
		 */

		/*
		 * System.out.println("************************"); for (int i=0;
		 * i<nombre.length();i++) { System.out.println(nombre.charAt(i)); }
		 */

		// while (condicion) diferencia de while al for es que for tiene indice y while
		// no
		int numeroOculto = 5;

		while (true) {
			System.out.println("Introduce un numero");
			int numeroUsuario = entrada.nextInt();

			if (numeroUsuario == numeroOculto) {
				System.out.println("Has acertado");
				break;// para poder salir de un bucle
			}
		}

		Random random = new Random();
		int numeroOculto = random.nextInt(10) + 1;

		while (true) { // 0..n se repite de 0 a n veces.
			System.out.println("Introduce un numero");
			int numeroUsuario = entrada.nextInt();

			if (numeroUsuario == numeroOculto) {
				System.out.println("Has acertado");
				break;// para poder salir de un bucle
			}
		}

		// do..while 1..n (se ejecuta siempre una vez) primero se evalua la condición
		int numeroUsuario = 0;
		do {
			System.out.println("Introduce un numero");
			numeroUsuario = entrada.nextInt();

		} while (numeroUsuario != numeroOculto);// != que sea diferente
		System.out.println("Has acertado");

		entrada.close();
		System.out.println("Fin del programa");

		// repetitivas - bucles1
	}

}

