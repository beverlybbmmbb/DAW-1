package ejerciccio7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el numero de filas: ");
		int filas=entrada.nextInt();
		
		System.out.println("Introduce el numero de columnas: ");
		int columnas = entrada.nextInt();
		int [][] matriz = new int [filas][columnas];
		//PARA PONER NUM A LAS POSICIONES DE LA MATRIZ
		//matriz [0][0]=3; 
		System.out.println("Introduce los numeros para la matriz");
		
		for (int fila=0;fila<matriz.length;fila++) {
			for (int col=0;col<matriz.length;col++) {
				matriz[fila][col]= entrada.nextInt();
			}
		}
		
		/*for (int fila=0;fila<matriz.length;fila++) {
			for (int col=0;col<matriz.length;col++) {
				System.out.print(matriz [fila][col]+ " ");
			}
			System.out.println();
			}*/
		
		
		//PARA SUMAR LAS FILAS Y LAS COLUMNAS
		for (int fila=0;fila<matriz.length;fila++) { 
			int sumaFila = 0;
			for (int col=0;col<matriz.length;col++) {
				sumaFila = sumaFila + matriz [fila][col];	
			}
			System.out.println("La suma de la fila " +fila+ " es " +sumaFila);
		}
		
		for (int col=0;col<5; col++) {
			int sumaColumna=0;
			for (int fila=0;fila<3;fila++) {
				sumaColumna = sumaColumna + matriz[fila][col];
				
			}
			System.out.println("La suma de la columna " +col+ " es " +sumaColumna);
		}
		entrada.close();
	}
}
