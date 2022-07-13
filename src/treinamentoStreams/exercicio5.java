package treinamentoStreams;

import java.util.ArrayList;
import java.util.List;

public class exercicio5 {

	/*
	 * Faça um programa que cria uma lista com 10 nomes. Em seguida, imprima o nome
	 * da primeira pessoa da lista que possua o nome terminado com "berto". Se não
	 * houver, imprima "zero berto"
	 */

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Maria bErTo");
		lista.add("Joao");
		lista.add("Guilherme Berto");
		lista.add("Jose Berto");
		lista.add("Carlos");
		lista.add("Luiz");
		lista.add("Maria");
		lista.add("Ana");
		lista.add("Sabrina");
		lista.add("Ana Berto");

		System.out.println(lista); 
		System.out.println();
		
		String berto = lista.stream()
				.filter(pessoa -> pessoa.toUpperCase().endsWith("BERTO"))
				.findFirst()
				.orElse("Zero berto");
		System.out.println(berto);
		
		
		System.out.println("Professor:");
		String nome = lista.stream()
				.filter(pessoa -> pessoa.endsWith("berto"))
				.findFirst()
				.orElse("Zero berto"); // professor
		System.out.println(nome);
	}
}
