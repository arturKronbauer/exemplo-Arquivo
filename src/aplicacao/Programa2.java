package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) {
		
		// Manipulação de arquivos com BufferedReader e FileReader
		// Inicialmente crie um arquivo com dados no caminho c:\temp\teste.txt
		String caminho = "C:\\temp\\teste.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
