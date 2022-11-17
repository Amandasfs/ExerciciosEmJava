import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        System.out.println("Exercício 4:  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\n" +
                "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas\n" +
                "decimais.");

        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       int numFuncionario;
       double  horasTrab, salPorHora, salario;
        System.out.println("Insira o número do funcionário: ");
        numFuncionario = sc.nextInt();

        System.out.println("Insira o número de horas trabalhadas: ");
        horasTrab = sc.nextDouble();

        System.out.println("Insira o valor da hora trabalhada: ");
        salPorHora = sc.nextDouble();

        System.out.println("Funcionário de Número " + numFuncionario);
        System.out.println("Recebe: ");
        salario = horasTrab * salPorHora;
        System.out.printf("R$=%.2f ", salario);

        sc.close();
    }
}
