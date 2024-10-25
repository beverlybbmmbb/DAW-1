import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		/* dar un numero por teclado y obtener todo los multiplos de ese numero */
		Scanner entrada = new Scanner(System.in);
        int n;
		int multi ;
		System.out.println("Introduce un numero");
		multi = entrada.nextInt();
		
		System.out.print("¿Hasta qué número quieres la lista?: ");
		 n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % multi == 0);
		System.out.println(i);	
		}

		System.out.println("El multiplo de " + multi + " es: " + multi + "");
		entrada.close();

	}

}
