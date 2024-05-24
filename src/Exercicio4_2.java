import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercicio4_2 {
    public static void main(String[] args) throws FileNotFoundException {
        String camArq = "NumMatriz.txt";
        File file = new File(camArq);
        Scanner scanner = new Scanner(file);
        int [][] numM = new int[5][6];

        for (int linha = 0; linha < numM.length; linha++){
            for (int coluna = 0; coluna < numM[linha].length; coluna++){
                numM[linha][coluna] = scanner.nextInt();
                System.out.printf("%d ",numM[linha][coluna]);
            }
            System.out.println("\n");
        }
        System.out.println();
        System.out.println(VerificarTransposicao(numM));

    }
    public static String VerificarTransposicao(int [][]matrixM){
        int tamanhoLinha = matrixM.length;
        int tamanhoColuna = matrixM[0].length;

        for (int linha = 0; linha < tamanhoLinha; linha++){
            for (int coluna = 0; coluna < tamanhoColuna; coluna++){
                if (matrixM[linha][coluna] != matrixM[coluna][linha]){
                    return "Não é simetrica";
                    }
                }
            }
        return "é simetrica";
    }
}
