import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
        
		System.out.println("Introduzca 10 numeros: ");
		for(int i = 0; i<numeros.length;i++) {
			numeros [i] = entrada.nextInt();	
		}
		int pares=0, impares=0;
		for (int i = 0; i<numeros.length;i++) {
			if (numeros [i] % 2 == 0) {
				pares++;	
			}else {
				impares++;
			}
		}
		System.out.println("El numero de pares es: "+pares);
		System.out.println("El numero de pares es: "+impares);
		entrada.close();
		}
		
	}



