import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Exercicio 2: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");
        System.out.println("Insira Um número inteiro positivo: ");
        Scanner sc = new Scanner(System.in);
        int numInteiro;
        numInteiro = sc.nextInt();
        if (numInteiro >= 0){
            if (numInteiro % 2 == 0){
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }
        }
        else {
            System.out.println("Número Inválido");
        }
        sc.close();
    }
}
