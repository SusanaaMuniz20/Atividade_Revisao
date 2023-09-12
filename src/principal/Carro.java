package principal;

import java.util.Scanner;

import entites.veiculo;

public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		veiculo veiculo = new veiculo ();
		
		
		veiculo.marca = "Onix";
		veiculo.ano = "2018";
		
		System.out.println("Modelo do carro é " + veiculo.marca + " sendo seu respectivo ano " + veiculo.ano);

		
		leia.close();
	}

}
