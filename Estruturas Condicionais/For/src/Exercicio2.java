import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Exercicio 2: Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\n" +
                "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\n" +
                "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).");

        int in = 0, out = 0, n, x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor máximo: ");
        n =sc.nextInt();
        for (int c = 0; c < n; c++){
            System.out.println("Insira um número inteiro: ");
            x=sc.nextInt();
            if(x >= 10 && x <= 20){
                in = in + 1;
            }else{
               out = out + 1;
            }
        }
        System.out.println("In: "+ in +"\nOut: " + out);
        sc.close();
     }
}
