public class Exercicio1p2 {
    public static void main(String[] args) {
        double notasM [][] = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };
        for (int coluna = 0;  coluna < notasM[1].length; coluna++){
            double soma = 0;
            double mediaProva = 0;
            int divisor = 0;
            for(int linha = 0; linha < notasM.length; linha++){
                soma += notasM[linha][coluna];
                divisor++;
            }
            mediaProva = soma / divisor;
            System.out.printf("Media da prova %d %.2f\n",coluna+1, mediaProva);
        }
    }
}
