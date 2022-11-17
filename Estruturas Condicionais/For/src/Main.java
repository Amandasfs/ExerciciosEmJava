import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 1: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o\n" +
                "X, se for o caso.");

        Scanner sc = new Scanner(System.in);
        int numX;
        System.out.println("Insira um número inteiro: ");
        numX = sc.nextInt();
        System.out.println("Os numeros impares são: ");

        for (int c = 1; c <= numX; c++){
            if (c %2 !=0){
                System.out.println(c);
            }
        }
        sc.close();
    }
}