package objetos;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String telefone;
	private LocalDate dat_nascto;
	
	public Pessoa(String nome, String telefone, LocalDate dat_nascto) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dat_nascto = dat_nascto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDat_nascto() {
		return dat_nascto;
	}
	public void setDat_nascto(LocalDate dat_nascto) {
		this.dat_nascto = dat_nascto;
	}
	public String toString() {
		return "\n Pessoa [nome=" + nome + ", telefone=" + telefone + ", dat_nascto=" + dat_nascto + "]";
	}
	
	
	
}