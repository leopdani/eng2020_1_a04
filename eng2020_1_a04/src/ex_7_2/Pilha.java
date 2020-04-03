package ex_7_2;

public class Pilha<T> {
	private T[] pilha;
	private int livre;
	
	public Pilha(int tamanho) {
		this.pilha = (T[])(new Object[tamanho]);
		this.livre = 0;
	}
	
	public void push(T n) {
		if (livre < pilha.length) {
			pilha[livre++] = n;
		} else {
			System.out.println("Pilha cheia.");
		}
	}
	
	public T pop() {
		if (livre > 0) {
			return pilha[--livre];
		} else {
			System.out.println("Pilha vazia.");
			return null; 
		}
	}

}