package principal;

import java.util.Scanner;

public class Numerospares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int numero = 2;
		while(numero <= 20) {
			System.out.println(numero + " ");
			numero += 2;
		}
		
		
		leia.close();
		
	}

}
