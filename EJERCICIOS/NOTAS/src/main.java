import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[] nota = new double[10];
		String [] asignaturas = {"Historia", 
				"Matematicas", 
				"Fisica", 
				"Euskera", 
				"Lengua", 
				"Tecnologia", 
				"Filosofia", 
				"Gimanasia", 
				"Ingles", 
				"Biologia"};
	 
		Double suma = 0;
/*MAS CORTO */
 for (int i=0;i<10;i++) {
 System.out.println("Introduzca una nota para la asignatura: "+(i+1) + ":");
		nota[i] = entrada.nextDouble();
		suma = suma + nota[i];
 }
	/*	System.out.println("Introduzca la 1º nota: ");
		nota[0] = entrada.nextDouble();

		System.out.println("Introduzca la 2º nota: ");
		nota[1] = entrada.nextDouble();

		System.out.println("Introduzca la 3º nota: ");
		nota[2] = entrada.nextDouble();

		System.out.println("Introduzca la 4º nota: ");
		nota[3] = entrada.nextDouble();

		System.out.println("Introduzca la 5º nota: ");
		nota[4] = entrada.nextDouble();

		System.out.println("Introduzca la 6º nota: ");
		nota[5] = entrada.nextDouble();

		System.out.println("Introduzca la 7º nota: ");
		nota[6] = entrada.nextDouble();

		System.out.println("Introduzca la 8º nota: ");
		nota[7] = entrada.nextDouble();

		System.out.println("Introduzca la 9º nota: ");
		nota[8] = entrada.nextDouble();

		System.out.println("Introduzca la 10º nota: ");
		nota[9] = entrada.nextDouble();

		double notatotal = 0;

		for (int i = 0; i < nota.length; i++) {
			notatotal = notatotal + nota[i];

		}*/

		double media = notatotal / nota.length;

		System.out.println("La nota media es " + media);
		entrada.close();
	}
}
