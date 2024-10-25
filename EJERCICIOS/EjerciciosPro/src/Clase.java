import java.util.Scanner;

public class Clase {

	public static void main(String[] args) {
		Scanner  entrada = new Scanner (System.in);
		
		     System.out.println("Introduce tu nombre: ");
		     String nombre = entrada.next();
		     
		     for (int i=nombre.length()-1;i>=0;i--){
		    	 System.out.println(nombre.charAt(i));
		     }
		      
		     System.out.println("Fin del programa");
		     entrada.close();

	}

}
