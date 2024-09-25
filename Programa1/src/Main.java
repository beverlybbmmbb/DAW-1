import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre del alumno: ");
		String nom= entrada.next();
		
		System.out.println("Introduzca las 1 notas del alumno:");
		Double nota1= entrada.nextDouble();
		
		System.out.println("Introduzca las 2 notas del alumno:");
		Double nota2= entrada.nextDouble();
		
		System.out.println("Introduzca las 3 notas del alumno:");
		Double nota3= entrada.nextDouble();
		
		System.out.println("Introduzca las 4 notas del alumno:");
		Double nota4= entrada.nextDouble();
		
		System.out.println("Introduzca las 5 notas del alumno:");
		Double nota5= entrada.nextDouble();
		
		 
		       Double media= (nota1+nota2+nota3+nota4+nota5)/5;
				if((nota1>=5 && nota2>=5 && nota3>=5 && nota4>=5 && nota5>=5)) {
					System.out.println("El alumno "+nom+"  tiene una media de "+media+" y es apto");
					
				} else {
					System.out.println("El alumno "+nom+"  tiene una media de "+media+" y no es apto");
					}
	             
				}
       
	

}

