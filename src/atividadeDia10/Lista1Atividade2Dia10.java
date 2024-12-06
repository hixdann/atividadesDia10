package atividadeDia10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1Atividade2Dia10 {

	public static void main(String[] args) {
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		Scanner leia = new Scanner(System.in);
		Integer num = Integer.valueOf(0);

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();

		if (numeros.indexOf(num) == -1) {
			System.out.println("\nNúmero " + num + " não foi encontrado");
		} else {
			System.out.println("\nA posição da nota " + num + " é: " + numeros.indexOf(num));
		}

		leia.close();

	}

}
