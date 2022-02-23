import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        // int[] chaves = new int[64000];
        // bubbleSort(chaves);

        Random gerador = new Random();
        int chaves [] = new int[64000];
        // Preenchendo o vetor com números aleatórios
        for (int i =0; i < chaves.length; ++i)
            chaves[i] = gerador.nextInt();
        bubbleSort(chaves);
    }

    public static void bubbleSort(int[] chaves) {
        int contdentro = 0, contfora = 0;
        int temp;
        // inicia o Bubble Sort
        for (int i = 0; i < chaves.length; i++) {
            for (int j = 1; j < chaves.length - i; j++) {
                contfora++;
                if (chaves[j - 1] > chaves[j]) {
                    contdentro++;
                    //troca os elementos
                    temp = chaves[j - 1];
                    chaves[j - 1] = chaves[j];
                    chaves[j] = temp;
                }
            }
        }
        System.out.println("contador fora: "+contfora);
        System.out.println("contador dentro com números randomizados: "+contdentro);
    }

}
