import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println(" Exercício 2: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro\n" +
                "casas decimais conforme exemplos.\n" +
                "Fórmula da área: area = π . raio2\n" +
                "Considere o valor de π = 3.14159");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio, area;

        System.out.println("Insira o valor do raio: ");
        raio = sc.nextDouble();
        area = pi * raio * raio;

        System.out.printf(" area=%.4f " , area);
        sc.close();
    }
}
