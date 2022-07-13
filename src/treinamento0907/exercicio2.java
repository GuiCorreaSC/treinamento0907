package treinamento0907;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import objetos.Aluno;

public class exercicio2 {

	/*
	 * Crie uma classe chamada Aluno, com numeroChamada, nome e dataNascimento. Em
	 * seguida, crie uma lista com 5 alunos e, em seguida, utilize
	 * Comparator.comparing para ordenar os alunos por data de nascimento. Mostre a
	 * lista ordenada.
	 */

	public static void main(String[] args) {

		List<Aluno> lista = new ArrayList<>();

		lista.add(new Aluno(1, "Joao", LocalDate.of(1980, 02, 10)));
		lista.add(new Aluno(2, "Maria", LocalDate.of(1990, 01, 20)));
		lista.add(new Aluno(3, "Jose", LocalDate.of(1995, 06, 30)));
		lista.add(new Aluno(4, "Guilherme", LocalDate.of(2000, 04, 26)));
		lista.add(new Aluno(5, "Sabrina", LocalDate.of(2002, 06, 19)));

		lista.sort(Comparator.comparing(a -> a.getDataNascimento()));

//		lista.sort(Comparator.comparing(Aluno::getDataNascimento).reversed()); // professor

		System.out.println(lista);

		;
	}

}
