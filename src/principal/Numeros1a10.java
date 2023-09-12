package principal;

import java.util.Scanner;

public class Numeros1a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		
		for(int contador = 0; contador < 11; contador++) {
			 System.out.println("Números de 1 a 10: " + contador);
		}
		
		
		leia.close();
	}

}
