import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 1: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");
        System.out.println("Insira Um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        int numInteiro;
        numInteiro = sc.nextInt();

        if (numInteiro >= 0){
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }
        sc.close();

    }
}