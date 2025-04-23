// Importar as bibliotecas;
import java.util.Scanner;
import java.util.Random;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sortear um número aleatório e salvar dentro de uma variável;
        Random random = new Random();

        // Definir o número secreto e definir a tentativa;
        String jogarNovamente = "sim";

        while (jogarNovamente.equalsIgnoreCase("sim")) { // Rodar o while caso a resposta for sim, caso não ignorar;

            int numeroSecreto = random.nextInt(10) + 1;
            int u_input = 0;
            int tentativas = 0;
            int palpite_max = 5;


            System.out.println("Tente advinhar um número entre 1 e 10!");


            while (u_input != numeroSecreto) {
                System.out.println("Digite seu palpite: ");
                u_input = input.nextInt();

                if (u_input < numeroSecreto) {
                    System.out.println("É maior!");
                    palpite_max -= 1;
                    System.out.println("Você tem " + palpite_max + " palpites restantes...");
                    tentativas += 1;
                } else if (u_input > numeroSecreto) {
                    System.out.println("É menor!");
                    palpite_max -= 1;
                    System.out.println("Você tem " + palpite_max + " palpites restantes...");
                    tentativas += 1;
                } else {
                    tentativas += 1;
                    System.out.println("Parabéns, você acertou!");
                    System.out.println("Você acertou em: " + tentativas + " tentativas!");
                }

                // Caso acabe as tentativas finalizar o jogo;
                if (palpite_max == 0) {
                    System.out.println("Você atingiu o limite máximo de tentativas!");
                    System.out.println("O número secreto era:" + numeroSecreto);
                    break;
                }
            }
            // Jogar novamente?
            System.out.println("Você deseja jogar novamente? (sim/não)");
            jogarNovamente = input.next();
        }
        System.out.println("Obrigado por jogar!");
    }
}
