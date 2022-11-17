import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Exercicio 5: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A\n" +
                "seguir, calcule e mostre o valor da conta a pagar.");
        System.out.println("\tCodigo \tEspecificação \t\t\t\tPreço" +
                "\n\t1 \t\tCachorro Quente \t\t\tR$ 4.00"+
                "\n\t2 \t\tX-Salada  \t\t\t\t\tR$ 4.50"+
                "\n\t3 \t\tX-Bacon \t\t\t\t\tR$ 5.00"+
                "\n\t4 \t\tTorrada Simples \t\t\tR$ 2.50"+
                "\n\t5 \t\tRefrigerante \t\t\t\tR$ 1.50");

        Scanner sc = new Scanner(System.in);
        int codProduto, cont = 0;
        double valorProduto, total = 0;
        String nomeProduto;
        while (cont < 5 ){
            System.out.println("Insira o código do produto: ");
            codProduto = sc.nextInt();
            if (codProduto == 1){

                nomeProduto = "Cachorro_Quente";
                valorProduto = 4.00;
                System.out.println(nomeProduto);
                System.out.println("R$"+valorProduto);
                total = total + valorProduto;

            } else if (codProduto == 2) {

                nomeProduto = "X-Salada";
                valorProduto = 4.50;
                System.out.println(nomeProduto);
                System.out.println("R$"+valorProduto);
                total = total + valorProduto;

            } else if (codProduto == 3) {

                nomeProduto = "X-Bacon";
                valorProduto = 5.00;
                System.out.println(nomeProduto);
                System.out.println("R$"+valorProduto);
                total = total + valorProduto;

            } else if (codProduto == 4) {

                nomeProduto = "Torrada_Simples";
                valorProduto = 2.50;
                System.out.println(nomeProduto);
                System.out.println("R$"+valorProduto);
                total = total + valorProduto;

            } else if (codProduto == 5) {

                nomeProduto = "Refrigerante";
                valorProduto = 1.50;
                System.out.println(nomeProduto);
                System.out.println("R$"+valorProduto);
                total = total + valorProduto;
            }
            System.out.println("Total da compra de R$"+total);
            cont++;
        }
        sc.close();


    }
}
