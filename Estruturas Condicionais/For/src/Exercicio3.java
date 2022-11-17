import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Exercicio 3: Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste\n" +
                "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes\n" +
                "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem\n" +
                "peso 5.");
        Locale.setDefault(Locale.US);
            int n;
            double val1, val2, val3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número de casos de teste: ");
        n = sc.nextInt();
        for (int c = 1; c <= n; c++){
            System.out.println("Insira o primeiro valor: ");
            val1 = sc.nextDouble();
            System.out.println("Insira o segundo valor: ");
            val2 = sc.nextDouble();
            System.out.println("Insira o terceiro valor: ");
            val3 = sc.nextDouble();

            media = (val1 * 2.0 + val2 * 3.0 + val3 * 5.0) / 10.0;
            System.out.printf("Média: %.1f%n" , media);
        }
        System.out.println("Fim do Teste!");
        sc.close();
    }
}
