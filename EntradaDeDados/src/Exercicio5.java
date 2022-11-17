import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args){

        System.out.println("Exercício 5: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o"+
             "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorUnitarioDasPecas1,valorUnitarioDasPecas2,soma1,soma2, total;
        int numeroDePecas1, numeroDePecas2, codigoPeca1, codigoPeca2;

        System.out.println("Insira o codigo da 1ª peça: ");
        codigoPeca1 = sc.nextInt();

        System.out.println("Insira a quantidade de peças: ");
        numeroDePecas1 = sc.nextInt();

        System.out.println("Insira o valor unitário da peça: ");
        valorUnitarioDasPecas1 = sc.nextDouble();

        soma1 = numeroDePecas1 * valorUnitarioDasPecas1;

        System.out.println("Insira o codigo da 2ª peça: ");
        codigoPeca2 = sc.nextInt();

        System.out.println("Insira a quantidade de peças: ");
        numeroDePecas2 = sc.nextInt();

        System.out.println("Insira o valor unitário da peça: ");
        valorUnitarioDasPecas2 = sc.nextDouble();

        soma2 = numeroDePecas2 * valorUnitarioDasPecas2;

        total = soma1 + soma2;
        System.out.println(codigoPeca1);
        System.out.println(codigoPeca2);
        System.out.printf("total a pagar = %.2f ",total);

        sc.close();
    }
}
