package projlistalinear;

public class Vetor {
    
    private Gamer[] gamers;     // armazena os elementos do vetor
    private int capacity;       // capacidade do vetor
    private int size;           // elementos no vetor
    
    public Vetor(int capacity) {
        gamers = new Gamer[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        //verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        //retornar a qtde de elementos da lista
        return size;
    }

    public Gamer get(int i) throws Exception {
        //retorna o conteúdo da posição i
        if (i >= size()) {
            throw new Exception("Posição Inválida!");
        }
        return gamers[i];
    }

    public void set(int i, Gamer novo) throws Exception {
        //altera o conteúdo da posição i para o valor de n
        if (i >= size) {
            throw new Exception("Posição Inválida!");
        }
        gamers[i]=novo;
    }
    
    public int buscaPos(int pontos){
        // metodo localiza e retorna o ponto de inserção do novo Gamer
        for(int i = 0; i < size; i++){
            findIndex(Gamer)
        }
    }
    
    public void add(int i, Gamer novo) throws Exception {
        //adiciona um novo elemento na posição i
        if (size == capacity)
            throw new Exception ("Lista cheia! Impossível inserir!");
        if (i>size)
            throw new Exception ("Posição de inserção inválida!");
        //abre espaço de inserção (mov direita)
        for(int j=size-1;j>=i;j--)
            gamers[j+1] = gamers[j];
        gamers[i]=novo;
        size++;
    }

    public void remove(int i) throws Exception {
        //remove o elemento da posição i
        if (isEmpty())
            throw new Exception ("Lista Vazia! Impossível remover!");
        if (i>=size)
            throw new Exception ("Posição de remoção inválida!");
        //desloca os elementos para a esquerda
        for (int j=i;j<=size-2;j++)
            gamers[j]=gamers[j+1];
        size--;
    }

    public int search(String nome) {
        //busca pelo nome indicado na lista
        for(int i=0;i<size;i++)
            if(nome.equals(gamers[i]))
                return i;
        //não encontrou
        return -1;
    }
    
    public Gamer[] getArray() {
        return gamers;
    }

    void add(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
