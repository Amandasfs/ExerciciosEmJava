import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Exercicio 7: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\n" +
                "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\n" +
                "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\n" +
                "Se o ponto estiver na origem, escreva a mensagem “Origem”.\n" +
                "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\n" +
                "situação.");
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Insira a cordenada x: ");
        x = sc.nextDouble();
        System.out.println("Insira a cordenada y: ");
        y = sc.nextDouble();
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
        sc.close();
    }
}
