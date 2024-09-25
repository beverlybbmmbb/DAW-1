import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner (System.in);
			
		System.out.println("Introduzca el tipo de cliente:Normal, Socio o VIP");
		String client= entrada.next();
		
		System.out.println("Introduzca el importe de la compra");
		Double importe= entrada.nextDouble();
		
		 switch (client) {
	     case "Normal":
	    	 double Normal=importe;
	         System.out.println("Total a pagar es importe "+Normal+"");
	         break;
	         
	     case "Socio":
	    	 double Socio= importe*0.05;
	    	 double totalso=importe-Socio;
	    	 System.out.println("Total a pagar es importe "+totalso+"");
	    	 break;
	    	 
	     case "VIP":
	    	 double VIP= importe*0.2;
	    	 double totalvip=importe-VIP;
	    	 System.out.println("Total a pagar es "+totalvip+"");
	    	 break;	    	     
	     }
	
			
	}

}
