
package projlistalinear;

/**
 *
 * @author 32129645
 */
public class Gamer {
    private String nome;
    private int score;

    public Gamer() {
    }

    public Gamer(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }
    

    public String getNome() {
        return nome;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Gamer{" + "nome=" + nome + ", score=" + score + '}';
    }
   
    
    
}
