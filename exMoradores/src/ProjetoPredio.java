// Carolina Carvalho dos Santos

public class ProjetoPredio {
    public static void main(String[] args) {
        int[][] mat = new int[10][8];
        preencheMat(mat);
        exibeMat(mat);
        System.out.println("Andar com maior n° de moradores:" + verAndar(mat));
        System.out.println("Qtde de apartamentos vazios:" + verVazio(mat));
        System.out.println("Total de moradores do prédio:" + somaTudo(mat));
    }

    public static void preencheMat(int[][] matriz){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 6);
            }
        }
    }

    public static void exibeMat(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static int verAndar(int[][] matriz){
        int indiceMaior = 0, maior = 0;
        for (int i = 0; i < matriz.length; i++){
            int somaAndar = 0;
            for (int j = 0; j < matriz[i].length; j++){
                somaAndar += matriz[i][j];
                if(somaAndar > maior){
                    maior = somaAndar;
                    indiceMaior = i;
                }
            }
        }
        return indiceMaior;
    }

    public static int verVazio(int[][] matriz){
        int vazio = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == 0){
                    vazio++;
                }
            }
        }
        return vazio;
    }

    public static int somaTudo(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
