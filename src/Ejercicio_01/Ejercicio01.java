package Ejercicio_01;

import java.util.*;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float centigrado = escorrecto();
		float far = fahr(centigrado) ;
		
		System.out.println("Los grados introducidos son "+far + " Fahrengeins");
	}
	public static float escorrecto(){
		Scanner jr = new Scanner(System.in);
		String grado ;
		float grados = 0f;
		boolean esCorrecto = false;
		
		do{
			System.out.println("Introduce una cantidad");
			grado = jr.next();
			if(tryparse(grado)){
				
				grados =  Float.parseFloat(grado);
				esCorrecto = true;
			}else{
				
				esCorrecto = false;
				System.out.println("ERROR: No introducistes un numero");
				
			}
			
		}while(esCorrecto == false);
		jr.close();
		return grados;
		
	}

		public static boolean tryparse(String grado){
			try {
				Float.parseFloat(grado);
				return true;
			}catch(Exception e){
				return false;
			}
				
			
			
		}
		public static float fahr(float centigrados){
			
			
			return 32 + (9*(centigrados/5));
			
			
		}
		
}
