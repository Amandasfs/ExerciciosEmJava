import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Exercicio 8: Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem\n" +
                "que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem\n" +
                "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\n" +
                "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e\n" +
                "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.");

        System.out.println("\n\tRenda \t\t\t\t\t\t\tImposto de Renda" +
                "\n\tde 0.00 a R$ 2000,00 \t\t\tInsento"+
                "\n\tde R$ 2000,01 até R$3000,00 \t8%"+
                "\n\tde R$ 3000,01 até R$4500,00 \t18%"+
                "\n\tacima de R$ 4500,00 \t\t\t28%");

        System.out.println("\nLembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de\n" +
                "salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é\n" +
                "de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com\n" +
                "duas casas decimais.");
        Scanner sc = new Scanner(System.in);
        double salario, imposto;
        System.out.println("Insira o seu salário: ");
        salario = sc.nextDouble();
        if (salario>= 0 && salario <= 2000.00){
            System.out.println("Insento de impostos");

        } else if (salario >= 2000.01 && salario <= 3000.00){
            System.out.println("A Taxa é de 8%");
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("Total a pagar é de R$ %.2f%n", imposto);
            
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            System.out.println("A Taxa é de 18%");
            imposto = (salario - 3000.00) * 0.18;
            System.out.printf("Total a pagar é de R$ %.2f%n", imposto);
            

        } else if (salario > 4500.00) {
            System.out.println("A Taxa é de 28%");
            imposto = (salario - 4500.00) * 0.28;
            System.out.printf("Total a pagar é de R$ %.2f%n", imposto);
        }
        sc.close();

    }
}
