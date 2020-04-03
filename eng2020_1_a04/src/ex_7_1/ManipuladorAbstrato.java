package ex_7_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class ManipuladorAbstrato {
	// Manipula a String
	public final void manipularString() throws Exception {
		// Ler a string
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite algo: ");
		String string = reader.readLine();

		// Transforma
		System.out.println("Transformado: " + transformarString(string));
		System.out.println();
	}

	// Transforma a string
	protected abstract String transformarString(String string);
}
