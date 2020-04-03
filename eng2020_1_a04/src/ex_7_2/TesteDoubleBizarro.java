package ex_7_2;

import java.util.Arrays;

public class TesteDoubleBizarro {

	public static void main(String[] args) {
		DoubleBizarro[] db = new DoubleBizarro[10];
		
		//gerando um vetor com 10 DoubleBizarros aleatórios
		for(int i = 0; i < 10; i++) {
			db[i] = new DoubleBizarro(Math.floor(10*Math.random())+Math.random());
			System.out.println(db[i].doubleValue());
		}
		
		Arrays.sort(db);
		
		System.out.println("Ordenado somente pelas casas decimais.");
		System.out.println(Arrays.toString(db));
		
		
	}

}