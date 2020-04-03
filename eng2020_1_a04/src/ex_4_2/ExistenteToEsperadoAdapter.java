package ex_4_2;

import java.util.ArrayList;
import java.util.List;

public class ExistenteToEsperadoAdapter implements SomadorEsperado {
	
	public final SomadorExistente existente;
	
	public ExistenteToEsperadoAdapter(SomadorExistente existente) {
		this.existente = existente;
	}
	
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for(int i:vetor) {
			lista.add(i);
		}
		return existente.somaLista(lista);
	}
	
}