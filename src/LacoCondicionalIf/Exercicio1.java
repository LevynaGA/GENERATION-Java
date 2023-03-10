package LacoCondicionalIf;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 5;
        int soma = a + b;
        
        if (soma > c) {
            System.out.println("A soma de A + B é maior do que C");
        } else if (soma < c) {
            System.out.println("A soma de A + B é menor do que C");
        } else {
            System.out.println("A soma de A + B é igual a C");
        }
    }
 

}
