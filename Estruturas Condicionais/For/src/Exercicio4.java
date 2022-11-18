import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Exercicio 4: Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo\n" +
                "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\".");
        Scanner sc = new Scanner(System.in);
        double n, divisao;
        System.out.println("Insira um número: ");
        n = sc.nextDouble();
        for(double i = 0; i <= n; i++){
            if(n == 0){
                System.out.println("Divisão Impossível");
            }else {
                divisao = n / i;
                System.out.printf("%.2f%n" , divisao);
            }
        }
        sc.close();
    }
}
