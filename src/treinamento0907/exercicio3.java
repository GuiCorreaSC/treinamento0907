package treinamento0907;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import objetos.Aluno;

public class exercicio3 {

	/*
	 * Crie uma classe chamada Aluno, com numeroChamada, nome e dataNascimento. Em
	 * seguida, crie uma lista com 5 alunos e, em seguida, remova da lista todos os
	 * alunos cujo nome começa com a letra T
	 */

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno(1, "Joao", LocalDate.of(1980, 02, 10)));
		alunos.add(new Aluno(2, "Maria", LocalDate.of(1990, 01, 20)));
		alunos.add(new Aluno(3, "Tulio", LocalDate.of(1995, 06, 30)));
		alunos.add(new Aluno(4, "Guilherme", LocalDate.of(2000, 04, 26)));
		alunos.add(new Aluno(5, "Tiago", LocalDate.of(2002, 06, 19)));

		System.out.println(alunos);

		alunos.removeIf(aluno -> aluno.getName().toUpperCase().startsWith("T"));
		System.out.println(alunos);

	}

}
