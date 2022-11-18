import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Nome: ");
        student.name = sc.nextLine();
        System.out.println("Nota 1: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("Não Passou :(");
            System.out.printf("Faltam %.2f Pontos%n", student.missingPoints());
        }
        else {
            System.out.println("PASSOU!!!");
        }
        sc.close();
    }
}