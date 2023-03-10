package JavaLacosRepeticao;

import java.util.Scanner;

public class JavaLacosRepeticaoWhile {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = 0;
        int totalMenores = 0;
        int totalMaiores = 0;

        while (idade >= 0) {
            System.out.print("Digite uma idade: ");
            idade = entrada.nextInt();

            if (idade < 21 && idade >= 0) {
                totalMenores++;
            } else if (idade > 50) {
                totalMaiores++;
            }
        }

        System.out.println("Total de pessoas menores de 21 anos: " + totalMenores);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores);

        entrada.close();
    }

}
