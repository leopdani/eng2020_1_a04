package ex_5_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.util.Scanner;

public class IOFacade {
	public String abrirTexto(String arquivo) {
		StringBuilder sb = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(arquivo))) {
			while (scanner.hasNext()) {
				sb.append(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Não achei o arquivo pra ler");
			e.printStackTrace();
		}
		return sb.toString();
	}

	public byte[] abrirBinario(String arquivo) {
		try {
			byte[] fileContent = Files.readAllBytes(new File(arquivo).toPath());
			return fileContent;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	public Object abrirObjeto(String arquivo) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {;
			return in.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}