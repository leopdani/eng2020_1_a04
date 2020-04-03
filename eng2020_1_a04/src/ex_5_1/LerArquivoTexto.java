package ex_5_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivoTexto {

    public static void main(String args[]) throws IOException {
        Path path = Paths.get("teste.txt");

        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            System.out.println( linha );
        }
    }
}