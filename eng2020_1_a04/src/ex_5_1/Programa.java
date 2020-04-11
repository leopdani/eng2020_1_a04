package ex_5_1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Programa {
	
	public static void main(String[] args) {
		
		escreverObjeto();
		IOFacade ioFacade = new IOFacade();
		System.out.println("Arquivo texto: " + ioFacade.abrirTexto("confidencial.txt"));
		System.out.print("Arquivo binário (bytes lidos): ");
		for (byte b : ioFacade.abrirBinario("confidencial.txt")) {
			System.out.print(b + " ");
		};
		System.out.println("\nArquivo com objeto: " + ioFacade.abrirObjeto("aluno.obj"));
	}

	private static void escreverObjeto() {
		Aluno aluno = new Aluno(1, "Gugu", 8.0);
		try {
			FileOutputStream fileOut = new FileOutputStream("aluno.obj");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(aluno);
			objectOut.close();
		} catch (Exception ex) {
			System.out.println("Não foi possível escrever o objeto.");
			ex.printStackTrace();
		}
	}
}