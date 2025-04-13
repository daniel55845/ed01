package ed01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanfj = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.print("Digite o seu nome: ");
        String nomeJogador = scanfj.nextLine();

        Jogador jogador = new Jogador(nomeJogador);
        Jogo jogo = new Jogo(jogador);

        System.out.println("Tente adivinhar o número secreto (entre 1 e 100)!");
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Sua tentativa: ");
            int tentativa = scanfj.nextInt();
            String resultado = jogo.jogar(tentativa);
            System.out.print("\033[H\033[2J"); // limpa a tela do console em cada tentativa 
            System.out.println(resultado);

            if ("Acertou!".equals(resultado)) {
                acertou = true;
            }
        }

        System.out.printf("Você acertou em %d tentativas e sua pontuação final foi %d de 100.%n",
                jogador.getTentativas(), jogador.getPontuacao());

        placar.adicionarJogador(jogador);
        placar.mostrarRanking();

        scanfj.close();
    }
}
