import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args)
    {
        System.out.println("Exercício 6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\n" +
                "mostre:\n" +
                "a) a área do triângulo retângulo que tem A por base e C por altura.\n" +
                "b) a área do círculo de raio C. (pi = 3.14159)\n" +
                "c) a área do trapézio que tem A e B por bases e C por altura.\n" +
                "d) a área do quadrado que tem lado B.\n" +
                "e) a área do retângulo que tem lados A e B.");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, calculo;
        System.out.println("Insira o 1° valor: ");
        A = sc.nextDouble();
        System.out.println("Insira o 1° valor: ");
        B = sc.nextDouble();
        System.out.println("Insira o 1° valor: ");
        C = sc.nextDouble();

        System.out.println("Resoluções ");

        double areaTrianguloRetangulo, areaCirculoRaio, areaDoTrapezio, areaQuadrado, areaRetangulo;

        System.out.println("a) a área do triângulo retângulo que tem A por base e C por altura.");
            areaTrianguloRetangulo = A * C / 2.0;
        System.out.printf("%.3f%n",areaTrianguloRetangulo);
        System.out.println("b) a área do círculo de raio C. (pi = 3.14159)");
            areaCirculoRaio = C * 3.14159;
        System.out.printf("%.3f%n",areaCirculoRaio);
        System.out.println("c) a área do trapézio que tem A e B por bases e C por altura.");
            areaDoTrapezio = (A + B) / 2.0 * C;
        System.out.printf("%.3f%n",areaDoTrapezio);
        System.out.println("d) a área do quadrado que tem lado B.");
            areaQuadrado = B * B;
        System.out.printf("%.3f%n",areaQuadrado);
        System.out.printf("e) a área do retângulo que tem lados A e B.");
            areaRetangulo = A * B;
        System.out.printf("%.3f%n",areaRetangulo);

        sc.close();
    }
}
