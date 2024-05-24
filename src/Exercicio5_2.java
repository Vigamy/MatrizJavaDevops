import java.util.Arrays;

public class Exercicio5_2 {
    public static void main(String[] args) {
        int [][] m1= {
            {1, 2},
            {3, 4}
    };
        int [][] m2 = {
            {2, 5},
            {6, 3}
        };
        System.out.println(Arrays.deepToString(multiplicacaoMatriz(m1, m2)));


    }
    public static int [][] multiplicacaoMatriz(int [][] m1, int [][]m2){
        int coluna = 0;
        int [][] novaM = new int[m1.length][m2[0].length];
        for (int l = 0; l < m1.length; l++){
            int num1 = 0;
            int num2 = 0;
            int soma = 0;
            for (int c =0; c < m1[0].length; c++) {
                num1 = m1[l][c] * m2[c][l];
                num2 = m1[l][c] * m2[c][l];
                soma = num1 + num2;
                novaM[l][c] = soma;
            }
        }
        return novaM;
    }
}
