package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa5 {
	public static void main(String[] args) {
		
		// Manipulando pastas com File 
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um caminho para a pasta: ");
		String pasta = sc.nextLine();
		File caminho = new File(pasta);
		
		// File::isDirectory serve para pegar apenas as pastas
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("PASTAS:");
		for (File pt : pastas) {
			System.out.println(pt);
		}
		
		// File::isFile serve para pegar apenas os arquivos
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("ARQUIVOS:");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		// Para criar uma subpasta no caminho informado
		boolean sucesso = new File(pasta + "\\subpasta").mkdir();
		System.out.println("Pasta criada com sucesso: " + sucesso);
		sc.close();
	}
}
