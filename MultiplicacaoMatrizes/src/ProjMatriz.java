public class ProjMatriz {
    public static void main (String[] args){
        int[][] A = new int [2][2];
        int[][] B = new int [2][2];
        //preenche as matrizes A e B com números aleatórios
        preencheA(A);
        preencheB(B);
        //cria a matriz C para receber o resultado
        int[][] C = new int [A.length][B[0].length];
        C = multiplica (A,B);
        exibeResult(C);
    }

    public static void preencheA(int A[][]){
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                A[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void preencheB(int B[][]){
        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[i].length; j++){
                B[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static int[][] multiplica (int[][]A, int[][]B) {
        int[][] C = new int [A.length][B[0].length];
        int cont = 0;
        for (int i=0;i<A.length;i++)
            for (int j=0;j<B[0].length;j++){
                C[i][j]=0;
                for (int k=0;k<A[0].length;k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    cont++;
                }
            }
        System.out.println(cont);
        return C;
    }

    public static void exibeResult(int C[][]){
        for (int i = 0; i < C.length; i++){
            for (int j = 0; j < C[i].length; j++){
                System.out.print(C[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}


