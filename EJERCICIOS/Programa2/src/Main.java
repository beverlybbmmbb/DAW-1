import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner (System.in);
			
		System.out.println("Introduzca el tipo de cliente: Normal, Socio o VIP");
		String client= entrada.next();
		
		System.out.println("Introduzca el importe de la compra");
		Double importe= entrada.nextDouble();
		entrada.close();
		
		 switch (client) {
	     case "Normal":
	    	 
	         System.out.println("Total a pagar es importe "+importe+"");
	         break;
	         
	     case "Socio":
	    	 
	    	 System.out.println("Total a pagar es importe "+importe*0.95+"");
	    	 break;
	    	 
	     case "VIP":
	    	 System.out.println("Total a pagar es "+importe*0.8+"");
	    	 break;	    	     
	     }
		 
	/*System.out.println("Que tipo de cliente eres:");
	System.out.println("1-Cliente regular");
	System.out.println("2-Socio");
	System.out.println("3-VIP");
	
	int tipoCliente= entrada.nextDouble();	
	double importeFinal=0;
	switch (tipoCliente){
	case 1:
	importefinal=importe;
	case 2:
	importefinal=importe*0.8;
	case 3:
	importefinal=importe*0.95;
			*/
	}

}

