package ed01;

/**
 * Armazena e gerencia os dados de um jogador no jogo de adivinhação.
 * @author Daniel Tomaz Dal Cortivo
 */

public class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * Cria um novo jogador com um nome.
     * @param nome Nome do jogador 
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     *  Métodos de get e set dos atributos @param nome, @param tentativas, @param pontuacao
     */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Incrementa em 1 o contador de tentativas.
     */
    public void incrementarTentativas() {
        this.tentativas++;
    }

    /**
     * Adiciona valor a pontuação atual .
     * @param valor acresenta valor a pontucao
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}

