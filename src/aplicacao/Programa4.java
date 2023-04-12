package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa4 {

	public static void main(String[] args) {
		// Escrevendo em arquivos com BufferedWriter e FileWriter
		
		String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa noite" };
		String caminho = "C:\\temp\\teste1.txt";
		
		// adiciona dados no final do arquivo
		// try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
		
		// Recria o arquivo todas as vezes
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
