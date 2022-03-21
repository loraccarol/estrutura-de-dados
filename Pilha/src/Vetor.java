public class Vetor {

    private int[] vetor;     // armazena os elementos do vetor
    private int capacity;       // capacidade do vetor
    private int size;           // elementos no vetor

    public Vetor(int capacity) {
        vetor = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        //verifica se a lista estÃ¡ vazia
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

    public int get(int i) throws Exception {
        //retorna o conteÃºdo da posiÃ§Ã£o i
        if (i >= size()) {
            throw new Exception("PosiÃ§Ã£o InvÃ¡lida!");
        }
        return vetor[i];
    }

    public void set(int i, int novo) throws Exception {
        //altera o conteÃºdo da posiÃ§Ã£o i para o valor de n
        if (i >= size) {
            throw new Exception("PosiÃ§Ã£o InvÃ¡lida!");
        }
        vetor[i]=novo;
    }

    public void add(int i, int novo) throws Exception {
        //adiciona um novo elemento na posiÃ§Ã£o i
        if (size()==capacity)
            throw new Exception ("Lista cheia! ImpossÃ­vel inserir!");
        if (i>size)
            throw new Exception ("PosiÃ§Ã£o de inserÃ§Ã£o invÃ¡lida!");
        //abre espaÃ§o de inserÃ§Ã£o (mov direita)
        for(int j=size-1;j>=i;j--)
            vetor[j+1] = vetor[j];
        vetor[i]=novo;
        size++;
    }

    public void remove(int i) throws Exception {
        //remove o elemento da posiÃ§Ã£o i
        if (isEmpty())
            throw new Exception ("Lista Vazia! ImpossÃ­vel remover!");
        if (i>=size)
            throw new Exception ("PosiÃ§Ã£o de remoÃ§Ã£o invÃ¡lida!");
        //desloca os elementos para a esquerda
        for (int j=i;j<=size-2;j++)
            vetor[j]=vetor[j+1];
        size--;
    }

    public int search(int nome) {
        //busca pelo nome indicado na lista
        for(int i=0;i<size;i++)
            if(nome==(vetor[i]))
                return i;
        //nÃ£o encontrou
        return -1;
    }

    public int[] getArray() {
        return vetor;
    }
}
