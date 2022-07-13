package treinamentoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class exercicio2 {

	/*
	 * Faça um programa que cria uma lista com 50 números aleatórios de 1 a 100 e
	 * mostre a média de todos os números maiores que 50
	 */

	public static void main(String[] args) {

		Random r = new Random();
		List<Integer> lista = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			lista.add(r.nextInt(100));
		}

		System.out.println(lista);

		System.out.printf("%.2f",lista.stream()
				.filter(n -> n > 50)
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0));

		System.out.println();
		System.out.println("PROFESSOR: ");
		
		List<Integer> lista2 = r.ints(50, 1, 100).boxed().collect(Collectors.toList());

		System.out.println(lista2);
		System.out.println(lista2.stream()
				.mapToInt(Integer::intValue)
				.filter(i -> i > 50)
				.average()
				.orElse(0));

	}

}
