import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int [] numeros= new int [8];
		
		for (int i=0;i<numeros.length;i++) {
			numeros [i] = (int) ((Math.random()*10)+1);
		}
		
		System.out.println("Introduce un numero a ver si tienes suerte: ");
		int numero=entrada.nextInt();
		boolean encontrado = false;
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]== numero) {
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("El numero esta en el array");
		}else {
			System.out.println("El numeor no esta en el array");
		}
		entrada.close();
	} 

}
