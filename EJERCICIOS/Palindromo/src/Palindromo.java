import java.util.Scanner;

public class Palindromo {
// Para que la palabra que pingamos nos diga si es palindromo o no
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		 
		 System.out.println("Introduce una palabra: "); 
		 String nomb = entrada.nextLine();
		 String palabrasSinEspacio;
		 String reversa="";
		  
		 for (int i = palabrasSinEspacio.length()-1; i>=0;i--){
				 if (nomb.charAt(i) != ' ') {
				 palabrasSinEspacio = palabrasSinEspacio + nomb.charAt(i);
			 }
		 }
		 for (int i=nomb.length()-1;i>=0;i--){ 
			 //System.out.println(nomb.charAt(i));
			 reversa = reversa + nomb.charAt(i);
		   
			 
		 if(nomb.equalsIgnoreCase(reversa)){//en String para comparar no se puede poner == porque estamos comparando//
			 System.out.println("La palabra "+nomb+"  es palindromo");
		 }else {
			 System.out.println("La palabra "+nomb+" no es palindromo");
		 }
		entrada.close();
		 }
		 
	}
	}
