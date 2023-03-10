package JavaPoo;

public class TestaCliente {
	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("João", "Rua A, 123", "(11) 1111-1111", "123.456.789-00");
		PessoaFisica pf2 = new PessoaFisica("Maria", "Rua B, 456", "(22) 2222-2222", "987.654.321-00");
		PessoaJuridica pj1 = new PessoaJuridica("Empresa X", "Av. C, 789", "(33) 3333-3333", "12.345.678/0001-00");
		PessoaJuridica pj2 = new PessoaJuridica("Empresa Y", "Av. D, 987", "(44) 4444-4444", "98.765.432/0001-00");

		System.out.println("Dados da pessoa física 1:");
		pf1.visualizar();
		System.out.println();

		System.out.println("Dados da pessoa física 2:");
		pf2.visualizar();
		System.out.println();

		System.out.println("Dados da pessoa jurídica 1:");
	}
}