package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		// Informações do caminho do arquivo
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o caminho de um arquivo: ");
		String pasta = sc.nextLine();
		File caminho = new File(pasta);
		System.out.println("Descrição do caminho: " + caminho.getPath());
		System.out.println("Descrição da pasta pai: " + caminho.getParent());
		System.out.println("Descrição da pasta: " + caminho.getName());
		sc.close();
	}
}
