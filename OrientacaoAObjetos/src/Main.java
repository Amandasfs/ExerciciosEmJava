import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por\n" +
                "uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda\n" +
                "que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter\n" +
                "para ser responsável pelos cálculos.\n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dollar? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("Quantos dollares você quer comprar? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("O Valor a pagar em Reais é de R$ %.2f%n" , result);
        sc.close();
    }
}