import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Exercicio 5: Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.\n" +
                "Lembrando que, por definição, fatorial de 0 é 1.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Número: ");
        int n = sc.nextInt();
        int fatorial = 1;
        if (n == 0){
            fatorial = 1;
            System.out.println(fatorial);

        }else {
            for (int i = 1; i <= n; i++){
                fatorial = fatorial * i;
                System.out.println(fatorial);
            }
        }
        sc.close();
    }
}
