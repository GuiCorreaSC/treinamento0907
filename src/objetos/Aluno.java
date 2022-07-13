package objetos;

import java.time.LocalDate;

public class Aluno {

	private Integer numeroChamada;
	private String name;
	private LocalDate dataNascimento;
	
	public Aluno(Integer numeroChamada, String name, LocalDate dataNascimento) {
		super();
		this.numeroChamada = numeroChamada;
		this.name = name;
		this.dataNascimento = dataNascimento;
	}

	public Integer getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(Integer numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "\n Aluno [numeroChamada=" + numeroChamada + ", name=" + name + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
	
}
