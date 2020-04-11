package ex_5_1;

import java.io.Serializable;


public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	long id;
	String nome;
	double nota;
	
	public Aluno(long id, String nome, double nota) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return "ID: " + id + "; Nome: " + nome + "; Nota: " + nota;
	}
}