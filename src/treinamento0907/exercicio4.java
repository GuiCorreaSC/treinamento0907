package treinamento0907;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class exercicio4 {

	/*
	 * Crie uma lista de 20 números aleatórios de 1 a 10. Em seguida, substitua
	 * todos os números por seu quadrado. Utilize a função replaceAll para isso.
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Random rand = new Random();

		for (int i = 1; i <= 10; i++) {
			lista.add(rand.nextInt(10));
		}
		System.out.println(lista);

		lista.replaceAll(i -> i * i);

		System.out.println(lista);
	}
}