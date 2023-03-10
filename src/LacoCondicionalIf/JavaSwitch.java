package LacoCondicionalIf;

import java.util.Scanner;

public class JavaSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o código do produto (de 1 a 6): ");
		int codigo = input.nextInt();

		System.out.print("Digite a quantidade comprada: ");
		int quantidade = input.nextInt();

		double precoUnitario = 0.0;
		String nomeProduto = "";

		switch (codigo) {
		case 1:
			nomeProduto = "Cachorro Quente";
			precoUnitario = 10.0;
			break;
		case 2:
			nomeProduto = "X-Salada";
			precoUnitario = 15.0;
			break;
		case 3:
			nomeProduto = "X-Bacon";
			precoUnitario = 18.0;
			break;
		case 4:
			nomeProduto = "Bauru";
			precoUnitario = 12.0;
			break;
		case 5:
			nomeProduto = "Refrigerante";
			precoUnitario = 8.0;
			break;
		case 6:
			nomeProduto = "Suco de laranja";
			precoUnitario = 13.0;
			break;
		default:
			System.out.println("Código inválido!");
			System.exit(0);
		}

		double valorTotal = quantidade * precoUnitario;

		System.out.printf("Produto: %s\nValor Total: R$ %.2f", nomeProduto, valorTotal);

		input.close();

	}
}
