package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("informe o nome do produto:");

		produto.nome = sc.nextLine();

		System.out.println("informe o preco do produto:");

		produto.preco = sc.nextDouble();

		System.out.println("informe a quantidade de produto:");

		produto.quantidade = sc.nextInt();

		System.out.println(produto.nome + "," + produto.preco + "," + produto.quantidade);
		sc.close();

	}

}
