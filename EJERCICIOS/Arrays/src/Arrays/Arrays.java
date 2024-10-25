package Arrays;
public class Arrays {

	public static void main(String[] args) {
		System.out.println(args);
		
		String [] semana = new String [7];// [||||||]se puede definir asi los ARRAYS
		
		semana [0] = "Lunes";// ["Lunes"||||||]
		semana [1] = "Martes";// ["Lunes"|"Martes"|||||]
		semana [1] = "Otro valor";// ["Lunes"|" Otro valor"|||||]
		semana [1] = null;
		
		System.out.println(semana [1]);
		
		/*String [] semana2 = {"lunes", "martes", "miercoles"};//o asi tambien se pueden definir*/
		
		System.out.println(args [1]);
		
		for (int i=0; i < args.length; i++) {
			System.out.println(args [i]);
		}
		
		
	
	}

}
