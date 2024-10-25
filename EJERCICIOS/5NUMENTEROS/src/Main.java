import java.util.Scanner;

public class Main {
	
	
	/*crear un programa que almacene 5 numeros enteros pr teclado y que los lea en un array y luego buscar el numero mas alto
	y luego muestra el numero mas alto del array.*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//int[] numeros = new int [5];
		
		
		System.out.println("Introduzca el 1º numero: ");
		int num1=entrada.nextInt();
		//numeros [0] = entrada.nextInt();
		System.out.println("Introduzca el 2º numero: ");
		int num2=entrada.nextInt();
		//numeros [1] = entrada.nextInt();
		System.out.println("Introduzca el 3º numero: ");
		int num3=entrada.nextInt();
		//numeros [2] = entrada.nextInt();
		System.out.println("Introduzca el 4º numero: ");
		int num4=entrada.nextInt();
		//numeros [3] = entrada.nextInt();
		System.out.println("Introduzca el 5º numero: ");
		int num5=entrada.nextInt();
		//numeros [4] = entrada.nextInt();
		
		//numeros [0] = num1;
		//numeros [1] = num1;
		//numeros [2] = num1;
		//numeros [3] = num1;
		//numeros [4] = num1;
		
		int [] numeros = {num1, num2, num3, num4, num5};
		int numeroMax = 0;
		
		for (int i=0; i<numeros.length; i++) {
			if (numeros [i]> numeroMax) {
				numeroMax = numeros [i];
			}
			
		}

		System.out.println("El numero maximo es : " +numeroMax);
		
		;
    entrada.close();
	}

}
