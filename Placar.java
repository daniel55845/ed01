package ed01;

import java.util.ArrayList;

/**
 * Armazena e exibe o ranking de jogadores com suas pontuações.
 * 
 * @author Daniel Tomaz Dal Cortivo
 * @see Jogador
 */

public class Placar {
    private ArrayList<Jogador> ranking;

    /**
     * Inicializa um placar vazio.
     */
    public Placar() {
        this.ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking
     */
    public void adicionarJogador(Jogador jogador) {
        this.ranking.add(jogador);
    }

    /**
     * Exibe o ranking de jogadores
     */
    public void mostrarRanking() {
        System.out.println("Ranking dos Jogadores:");
        for (Jogador jogador : ranking) {
            System.out.printf("%s - pontuação %d/100%n", 
                jogador.getNome(), 
                jogador.getPontuacao());
        }
    }
}
