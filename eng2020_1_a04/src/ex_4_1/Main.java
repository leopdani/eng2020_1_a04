package ex_4_1;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Cria os pares em uma matriz.
		Object[][] pares = new String[][] { { "Sao Paulo", "Parana", "Rio de Janeiro", "Santa Catarina", "Mato Grosso", "Amazonas" }, { "Sao paulo", "Curitiba", "Rio de Janeiro", "Florianopolis", "Cuiaba", "Manaus" } };

		// Cria um novo mapa com a matriz.
		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);
		
		// imprimi estadp e capital
		System.out.println("Estado" + " ============> " + "Capital");
		// Imprime os valores.
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " =======> " + entry.getValue());
		}
	}
}
