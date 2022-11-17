import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Exercicio 3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\n" +
                "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\n" +
                "ordem crescente ou decrescente.");

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Insira Um número inteiro: ");
        num1 = sc.nextInt();
        System.out.println("Insira Um número inteiro: ");
        num2 = sc.nextInt();
        if (num1 == 0 || num2 == 0){
            if (num1 % num2 == 0 || num2 % num2 == 0){
                System.out.println("São multiplos");
            }
            else {
                System.out.println("Não são multiplos");
            }
        }
        else {
            System.out.println("Insira um número maior que zero");
        }
        sc.close();
    }
}
