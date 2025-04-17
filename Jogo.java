package ed01;

import java.util.Random;

/**
 * Controla a lógica principal do jogo de adivinhação numérica 
 * @author Daniel Tomaz Dal Cortivo
 */
public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    /**
     * Inicializa um novo jogo com um jogador e cria um numero aleatorio de 0 a100.
     * @param jogador O jogador que participará da partida
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    /**
     * Avalia a tentativa do jogador e retorna o resultado.
     * A pontuação é calculada subtraindo o número de tentativas de 100.
     * 
     * @param tentativa O número fornecido pelo jogador (entre 1 e 100)
     * @return "Acertou!" se correto, ou indicação se o número é maior/menor
     */
    public String jogar(int tentativa) {
        jogador.incrementarTentativas();
        
        if (tentativa == numeroSecreto) {
            int pontos = 100 - jogador.getTentativas();
            if (pontos < 0) {
                pontos = 0; 
            }
            jogador.atualizarPontuacao(pontos);
            return "Acertou!";
        } else if (tentativa < numeroSecreto) {
            return "O número secreto é maior.";
        } else {
            return "O número secreto é menor.";
        }
    }
}
}
