import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero del mes: ");
		int mesnum =entrada.nextInt();	
		
		/*String [] mes = new String [12];
		mes [0] = "Enero" ;
		mes [1] = "Febrero";
		mes [2] = "Marzo";
		mes [3] = "Abril";
		mes [4] = "Mayo";
		mes [5] = "Junio";
		mes [6] = "Julio";
		mes [7] = "Agosto";
		mes [8] = "Septiembre";
		mes [9] = "Octubre";
		mes [10] = "Noviembre";
		mes [11] = "Diciembre";*/
		
		String [] mes= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", };
		
		if (mesnum > 0&& mesnum <= 12) {
	
		System.out.println(mes[mesnum-1]);
		}else {
			System.out.println("Ese mes no existe!!");
		}
		entrada.close();

	}}
	//crear arrays con todos los meses del año, pedir al usuario el numero de un mes y que le saque por consola el nombre del mes.

