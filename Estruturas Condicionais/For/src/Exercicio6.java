import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Exercicio 6: Ler um número inteiro N e calcular todos os seus divisores.");

        Scanner sc = new Scanner(System.in);
        double n;
        int divisor;
        System.out.println("Insira um número: ");
        n = sc.nextDouble();
        for(int i =0; i <= n; i ++){
            if (n %i ==0){
                divisor = i;
                System.out.println(divisor);

            }
            else {
                System.out.println(i + ": Indivisivel");
            }
        }
        sc.close();
    }
}
