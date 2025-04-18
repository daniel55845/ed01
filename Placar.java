package ed01;

import java.util.ArrayList;

/**
 * guarda e exibe o ranking dos jogadores com as pontuações.
 * @author Daniel Tomaz Dal Cortivo
 * @see Jogador
 */

public class Placar {

    private ArrayList<Jogador> ranking;
    
    public Placar() {
        
        this.ranking = new ArrayList<>();
        
    }

    
    public void adicionarJogador(Jogador jogador) {
        
        this.ranking.add(jogador);
        
    }

    public void mostra_Ranking() {

        System.out.println("Ranking dos Jogadores:");

        for (Jogador jogador : ranking) {
            
            System.out.printf("%s - pontuação %d/100%n", jogador.getNome(),  jogador.getPontuacao());
            
        }
        
        System.out.println("===============================================================");
    }
}
