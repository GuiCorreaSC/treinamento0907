package treinamentoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class exercicio1 {

	/*
	 * Fa�a um programa que cria uma lista com 50 n�meros aleat�rios de 1 a 100 e
	 * imprime a soma de todos os n�meros
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Random r = new Random();

		for (int i = 1; i <= 50; i++) {
			lista.add(r.nextInt(100));
		}

		System.out.println(lista);

		System.out.println(lista.stream()
				.reduce(0, (acc, val) -> acc + val));

		System.out.println();

  	/*
	 * List<Integer> lista2 = r.ints(50, 1,
	 * 100).boxed().collect(Collectors.toList()); //professor
	 * 
	 * System.out.println(lista2);
	 * System.out.println(lista2.stream().mapToInt(Integer::intValue).sum());
	 */

}

}
