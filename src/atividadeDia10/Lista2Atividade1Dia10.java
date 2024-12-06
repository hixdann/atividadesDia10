package atividadeDia10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista2Atividade1Dia10 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Integer n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		Scanner leia = new Scanner(System.in);
		// pedir os valores para o usuário
		System.out.println("Digite o 1° número ");
		n1 = leia.nextInt();
		System.out.println("Digite o 2° número sem ser igual ao anterior ");
		n2 = leia.nextInt();
		System.out.println("Digite o 3° número sem ser igual aos anteriores ");
		n3 = leia.nextInt();
		System.out.println("Digite o 4° número sem ser igual aos anteriores ");
		n4 = leia.nextInt();
		System.out.println("Digite o 5° número sem ser igual aos anteriores ");
		n5 = leia.nextInt();
		System.out.println("Digite o 6° número sem ser igual aos anteriores ");
		n6 = leia.nextInt();
		System.out.println("Digite o 7° número sem ser igual aos anteriores ");
		n7 = leia.nextInt();
		System.out.println("Digite o 8° número sem ser igual aos anteriores ");
		n8 = leia.nextInt();
		System.out.println("Digite o 9° número sem ser igual aos anteriores ");
		n9 = leia.nextInt();
		System.out.println("Digite o 10° número sem ser igual aos anteriores ");
		n10 = leia.nextInt();

		numeros.add(n1);
		numeros.add(n2);
		numeros.add(n3);
		numeros.add(n4);
		numeros.add(n5);
		numeros.add(n6);
		numeros.add(n7);
		numeros.add(n8);
		numeros.add(n9);
		numeros.add(n10);

		System.out.println("Números digitados: ");

		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		

		leia.close();

	}

}
