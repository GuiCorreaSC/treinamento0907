package treinamentoStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicio6 {

	/*Crie uma lista com 10 nomes de pessoas. Mostre apenas os nomes que começam com vogal, em ordem decrescente e separados por ponto e vírgula.
	 * */
	
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Ianca");
		lista.add("Joao");
		lista.add("Otavio");
		lista.add("Jose ");
		lista.add("Antonio");
		lista.add("Luiz");
		lista.add("Elton");
		lista.add("Ana");
		lista.add("Sabrina");
		lista.add("Ursula");
		
		lista.stream()
			.filter(p -> p.toUpperCase().charAt(0) == 'A' ||  p.toUpperCase().charAt(0) == 'E'
					||  p.toUpperCase().charAt(0) == 'I' ||  p.toUpperCase().charAt(0) == 'O'
					||   p.toUpperCase().charAt(0) == 'U')
			.sorted(Collections.reverseOrder())
			.forEach(p -> System.out.print(p +"; "));
		
 /*       System.out.println("Nomes que começam com vogal, em ordem descrescente, separados por ponto-e-virgula:"); //professor
        String nomes = lista.stream()
                .filter(pessoa -> pessoa.startsWith("A")
                        || pessoa.startsWith("E")
                        || pessoa.startsWith("I")
                        || pessoa.startsWith("O")
                        || pessoa.startsWith("U"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining("; "));
        System.out.println(nomes);
	//	lista.sort(Comparator.comparing(lista::)); */ 
	
	}

}
