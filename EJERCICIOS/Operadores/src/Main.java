
public class Main {

	public static void main(String[] args) {
		
      /*operadores aritmeticos*/
		// + sumar dos valores
	     int n1 = 3;
	     int n2 = 4;
	     
	     System.out.println(n1+n2);
	     
	     int n3 = 6;
	    float n4 = 3.5f;//poner f al final para que reconozca que es float
	     
	    System.out.println(n3+n4); 
		// -
		// /
		// *
	    
		// % devuelve el resto de la división
	    int n5 = 3;
	     int n6 = 4;
	     
	     System.out.println(n5%n6);
	     
		// ++ Suma uno
	     System.out.println("INCREMENTO");
	    int n7 = 8;
	    n7 = n7 + 1;
	    //n7++;
	     ++n7;
	     System.out.println(n7++);
	   
	    
		// -- Resta uno
	     System.out.println("DECREMENTO");
	   n7 = n7 - 1;
	   n7--;
	     
	     System.out.println(n7);
		
	/*operadores de relacionales*/
	     //Siempre devuelve un valor bolean
	     
	     //== Igualar dos cosas. 
	     System.out.println(1==1); //true
	     System.out.println(1==2); //false
	     
	     //!=
	     System.out.println(1!=1); //false
	     System.out.println(1!=2); //true
	     
	     //>
	     System.out.println(1 > 0);//true
	     System.out.println(1 > 1);//false
	     System.out.println(1 > 2);//false
	     
	     //<
	     System.out.println(1 < 0);//false
	     System.out.println(1 < 1);//false
	     System.out.println(1 < 2);//true
	     
	     //>=
	     System.out.println(1 >= 0);//true
	     System.out.println(1 >= 1);//true
	     System.out.println(1 >= 2);//false
	     
	     //<=
	     System.out.println(1 <= 0);//false
	     System.out.println(1 <= 1);//true
	     System.out.println(1 <= 2);//true
	     
	     
		 /*operadores logicos*/
	     //&&
	     System.out.println((1 < 0) && (1<2));//false. las dos tiene que ser verdadera para que sea true.
	     
	     //||
	     System.out.println((1 < 0) || (1<2));//true. cualquiera de las dos tendria que ser verdadera para que sea true.
	     
	     //!
	     System.out.println(!(1 <= 0));//true
	     System.out.println(!(1 <= 1));//false
	     
	}

}
