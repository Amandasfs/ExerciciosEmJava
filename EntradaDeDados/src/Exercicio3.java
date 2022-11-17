import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        System.out.println("Exercício 3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\n" +
                "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.println("Insira o 1º valor: ");
        a = sc.nextInt();
        System.out.println("Insira o 2º valor: ");
        b = sc.nextInt();
        System.out.println("Insira o 3º valor: ");
        c = sc.nextInt();
        System.out.println("Insira o 4º valor: ");
        d = sc.nextInt();

        diferenca = a * b - c * d;
        System.out.println("A Diferença é de: " + diferenca);

        sc.close();
    }
}
