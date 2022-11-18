import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf("%s, O Preço do Primeiro Produto é de R$ %.2f%n", product1, price1);
        System.out.printf("%s, O Preço do Segundo Produto é de R$ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Recordes: %d anos atrás, código %d e setor: %c%n",age,code,gender);
        System.out.println();
        System.out.printf("Em 8 casas decimais: %.8f%n",measure);
        System.out.printf("Em 3 casas decimais: %.3f%n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}