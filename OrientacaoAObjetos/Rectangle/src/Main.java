import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.println("Insira a altura: ");
        rect.height = sc.nextDouble();
        System.out.println("Insira a largura: ");
        rect.width = sc.nextDouble();

        System.out.printf("Area = %.2f%n" , rect.area());
        System.out.printf("Perimeter = %.2f%n", rect.perimeter());
        System.out.printf("Diagonal = %.2f%n",rect.diagonal());
        sc.close();
    }
}