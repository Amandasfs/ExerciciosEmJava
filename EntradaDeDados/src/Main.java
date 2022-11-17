import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Exercício 1: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma\n" +
                "mensagem explicativa, conforme exemplos.");

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Insira o 1º número: ");
        a = sc.nextInt();

        System.out.println("Insira o 2º número: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}