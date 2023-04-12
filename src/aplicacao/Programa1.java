package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		// Manipulação de arquivos com File e Scanner
		
		// Inicialmente crie um arquivo com dados no caminho c:\temp\teste.txt
		
		// Relacionando o arquivo criado com o objeto de File
		File arquivo = new File("C:\\temp\\teste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
