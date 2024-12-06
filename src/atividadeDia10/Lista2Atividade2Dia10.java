package atividadeDia10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista2Atividade2Dia10 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Integer num = Integer.valueOf(0);
		Scanner leia = new Scanner(System.in);

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

		if (numeros.contains(num)) {
			System.out.println("\nO Número " + num + " foi encontrado");
		} else {
			System.out.println("\nO número " + num + " não foi encontrado");
		}

		leia.close();

	}

}
