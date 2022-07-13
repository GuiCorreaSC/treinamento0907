package treinamentoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class exercicio3 {

	/*
	 * Faça um programa que cria uma lista com 50 números aleatórios de 1 a 100 e
	 * retorne quantos números "25" há na lista
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Random r = new Random();

		for (int i = 1; i <= 50; i++) {
			lista.add(r.nextInt(100));
		}

		System.out.println("Numeros aleatorios: " +lista);

		Stream<Integer> qtd = lista.stream()
				.filter(n -> n == 25);
		System.out.println(qtd.count());

/*        List<Integer> lista2 = r.ints(50, 1, 100).boxed().collect(Collectors.toList());
		System.out.println(lista2.stream() //professor
				.filter(n -> n == 25)
				.count()
				); */
		
		
		
	}

}
