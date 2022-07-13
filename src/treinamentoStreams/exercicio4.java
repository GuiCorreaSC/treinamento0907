package treinamentoStreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import objetos.Pessoa;

public class exercicio4 {
	/*
	 * Crie uma classe chamada Pessoa contendo nome, telefone e data de nascimento.
	 * A seguir, crie uma lista com 10 pessoas e mostre todas as pessoas que
	 * nascidas em maio, ordenadas por nome
	 */

	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<>();

		lista.add(new Pessoa("Joao", "(48) 9925-8432", LocalDate.of(1980, 5, 20)));
		lista.add(new Pessoa("Maria", "(48) 9925-8432", LocalDate.of(1980, 6, 20)));
		lista.add(new Pessoa("Antonela", "(48) 9925-8432", LocalDate.of(1980, 5, 20)));
		lista.add(new Pessoa("Ronaldinho", "(48) 9925-8432", LocalDate.of(1980, 6, 20)));
		lista.add(new Pessoa("Pele", "(48) 9925-8432", LocalDate.of(1980, 6, 20)));
		lista.add(new Pessoa("Thiago", "(48) 9925-8432", LocalDate.of(1980, 6, 20)));
		lista.add(new Pessoa("Guilherme", "(48) 9925-8432", LocalDate.of(1980, 6, 20)));
		lista.add(new Pessoa("Paulo", "(48) 9925-8432", LocalDate.of(1980, 5, 20)));
		lista.add(new Pessoa("Luiz", "(48) 9925-8432", LocalDate.of(1980, 6, 20)));
		lista.add(new Pessoa("Ana", "(48) 9925-8432", LocalDate.of(1980, 5, 20)));

		lista.stream().filter(p -> p.getDat_nascto().getMonthValue() == 5)
				.sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome())).forEach(System.out::print);

	}

}
