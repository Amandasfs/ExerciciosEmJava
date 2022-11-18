import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salário Bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Taxa: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + emp);
        System.out.println();
        System.out.print("Qual O Percentual de aumento salárial? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Data: " + emp);
        sc.close();
    }
}