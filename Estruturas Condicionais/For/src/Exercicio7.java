import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("Exercicio 7: Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,\n" +
                "começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme\n" +
                "exemplo.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro positivo: ");
        int n;
        n = sc.nextInt();
        if (n < 0){
            System.out.println("Insira um número POSITIVO: ");
        }else {
            for(int i = 1; i <= n; i++){
                int one = i;
                int two = i * i;
                int tree = i * i * i;
                System.out.printf("%d %d %d%n" , one, two, tree);
            }
        }

        sc.close();
    }
}
