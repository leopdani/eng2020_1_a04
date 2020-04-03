package ex_7_2;

import java.util.ArrayList;
import java.util.TreeSet;

public class TesteOrdem {
	
	public static void main(String[] args) {
		ArrayList<Aluno> alunos =  new ArrayList<>();
		alunos.add(new Aluno(3));
		alunos.add(new Aluno(5));
		alunos.add(new Aluno(1));
		alunos.add(new Aluno(30));
		alunos.add(new Aluno(37));
		alunos.add(new Aluno(2));
		alunos.add(new Aluno(5));
		alunos.add(new Aluno(8));
		alunos.add(new Aluno(22));
		alunos.add(new Aluno(15));
		alunos.add(new Aluno(30));

		
		System.out.println("Tamano da lista: "+alunos.size());
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		
		TreeSet<Aluno> ordenado = new TreeSet<>();
		for(Aluno aluno:alunos) {
			System.out.println(aluno.getRa()+" foi adicionado? "+ordenado.add(aluno));
		}
		System.out.println("*******************************");
		System.out.println("Tamanho da lista não ordenada: "+alunos.size());
		System.out.println("Tamanho da lista ordenada: "+ordenado.size());
		for(Aluno aluno: ordenado) {
			System.out.println(aluno);
		}

		
	}

}