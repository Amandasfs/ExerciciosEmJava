import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("Exercicio 2: Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema\n" +
                "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo\n" +
                "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).");
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Insira as Cordenadas: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
