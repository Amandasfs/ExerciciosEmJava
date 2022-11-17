import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Exercicio 4: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\n" +
                "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");
        Scanner sc = new Scanner(System.in);
        double horaInicial, horaFinal, soma;
        System.out.println("Insira a hora de inicio: ");
        horaInicial = sc.nextDouble();
        System.out.println("Insira a hora final: ");
        horaFinal = sc.nextDouble();
        if (horaInicial < horaFinal){
            soma = horaFinal - horaInicial;
        }
        else {
          soma =  24 - horaInicial + horaFinal ;
        }
        System.out.println("tempo de jogo é de:" + soma + "horas");
        sc.close();
    }
}
