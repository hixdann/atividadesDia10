package atividadeDia10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista1Atividade1Dia10 {

	public static void main(String[] args) {

		// Criei a Collection ArrayList, do tipo String, chamada cores
		ArrayList<String> cores = new ArrayList<String>();

		String cor1, cor2, cor3, cor4, cor5;
		Scanner leia = new Scanner(System.in);
		// pedir os valores para o usuário
		System.out.println("Digite uma cor ");
		cor1 = leia.next();
		System.out.println("Digite uma cor ");
		cor2 = leia.next();
		System.out.println("Digite uma cor ");
		cor3 = leia.next();
		System.out.println("Digite uma cor ");
		cor4 = leia.next();
		System.out.println("Digite uma cor ");
		cor5 = leia.next();

		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		cores.add(cor4);
		cores.add(cor5);

		System.out.println("Cores listadas: ");

		for (String cor : cores) {
			System.out.println(cor);
		}
		Collections.sort(cores);
		System.out.println("\nCores ordenadas: ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();

	}

}
