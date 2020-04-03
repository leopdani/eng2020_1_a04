package ex_7_2;

public class TestePilha {

	public static void main(String[] args) {
		Pilha<Aluno> pilha = new Pilha<>(5);
		for(int i = 0; i < 6; i++) {
			pilha.push(new Aluno(i));
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(pilha.pop());
		}
	}

}