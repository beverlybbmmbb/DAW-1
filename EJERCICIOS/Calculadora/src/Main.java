import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce un numero");
		int n1 = entrada.nextInt();
		
		System.out.println("Introduce otro numero");
		int n2 = entrada.nextInt();
		entrada.close();
		
		System.out.println("Elija: sumar, restar, multiplicar o dividir");
		String opciones= entrada.next();
		
		switch (opciones) {
		case "sumar":
		System.out.println(n1+n2); 
		break;
		case "restar":	
		System.out.println(n1-n2);
		break;
		case "multiplicar":
		System.out.println(n1*n2);
		break;
		case "dividir":
		System.out.println(n1/n2); 
		break;
		}
	}

}
