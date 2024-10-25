import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*int fact = 1;
		
		System.out.println("Introduce un numero");
		int num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("La factorial de " + num + " es: " + fact + "");
		entrada.close();*/
		
	
        int n;
        
        System.out.println("Ingresa un número:");
        n = entrada.nextInt();
        
        for(int i = 1 ; i <=n ; i++){
            if(n%i==0){
             System.out.println("Los numeros divisores son: "+i);                
            }           
        }
	}
}
