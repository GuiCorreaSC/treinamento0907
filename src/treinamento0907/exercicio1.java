package treinamento0907;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class exercicio1 {
	
	/* Fa�a um programa que preencha uma lista com 50 n�meros aleat�rios. A seguir,
	 * mostre essa lista usando o m�todo forEach*/

	public static void main(String[] args) {

		Random r = new Random();
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 1 ; i <=50 ; i++) {
			lista.add(r.nextInt(100));
		}
				
		lista.stream().forEach(e -> System.out.println(e));
		
	}

}
