package principal;

import java.util.Random;
import java.util.Scanner;

public class AdvinharNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		Random random = new Random();

		int numeroAleatorio = random.nextInt(100) +
		1;

		int tentativa, contadorTentativas = 0;

		Random scanner;
		do { System.out.print("Tente adivinhar o n�mero (entre 1 e 100): ");

		tentativa = scanner.nextInt();

		contadorTentativas++;

		contadorTentativas++;

		if (tentativa < numeroAleatorio) {

		System.out.println("Tente um n�mero maior.");

		}

		else if (tentativa > numeroAleatorio) {
		System.out.println("Tente um n�mero	menor.");

		} else {

		System.out.println("Parab�ns! Voc� acertou em " + contadorTentativas + " tentativas.");

		}

		} while (tentativa != numeroAleatorio); scanner.close(); }
		
		
		

  }
