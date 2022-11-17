import java.util.Scanner;

public class Exercico6 {
    public static void main(String[] args) {
        System.out.println("Exercicio 6: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos\n" +
                "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\n" +
                "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Insira Um número: ");
        num = sc.nextInt();
        if (num >= 0 && num <= 25){
            System.out.println("O Valor está no grupo de [0 á 25]");
        } else if (num > 25 && num <= 50) {
            System.out.println("O Valor está no grupo de [25 á 50]");
        }else if (num > 50 && num <= 75) {
            System.out.println("O Valor está no grupo de [50 á 75]");
        }else if (num > 75 && num <= 100) {
            System.out.println("O Valor está no grupo de [75 á 100]");
        }
        sc.close();
    }
}
