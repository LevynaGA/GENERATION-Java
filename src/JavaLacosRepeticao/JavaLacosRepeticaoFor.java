package JavaLacosRepeticao;

import java.util.Scanner;

public class JavaLacosRepeticaoFor {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println("Intervalo inválido!");
        } else {
            System.out.printf("No intervalo entre %d e %d: ", num1, num2);
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d é múltiplo de 3 e 5 ", i);
                }
            }
        }

        sc.close();
    }

}
