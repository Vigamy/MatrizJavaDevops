import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercicio3_3 {
    public static void main(String[] args) throws FileNotFoundException {
        String camArq = "NumInteiro.txt";
        File file = new File(camArq);
        Scanner scanner = new Scanner(file);
        int [][] numM = new int[4][5];
        for (int linha = 0; linha < numM.length; linha++){
            for (int coluna = 0; coluna < numM[linha].length; coluna++){
                numM[linha][coluna] = scanner.nextInt();
                System.out.printf("%d ", numM[linha][coluna]);
            }
            System.out.println("\n");
        }
        System.out.println("Posições:\n " + EncontrarMax(numM));
    }
    public static StringBuilder EncontrarMax(int [][] matrizM){
        int numMaior = matrizM[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        StringBuilder posicoes = new StringBuilder();
        for (int linha = 0; linha < matrizM.length; linha++){
            for (int coluna = 0; coluna < matrizM[0].length; coluna++){
                if (numMaior < matrizM[linha][coluna]){
                    numMaior = matrizM[linha][coluna];
                }
            }
        }
        for (int linha = 0; linha < matrizM.length; linha++){
            for (int coluna = 0; coluna < matrizM[0].length; coluna++){
                if (numMaior == matrizM[linha][coluna]){
                    posicoes.append("Número " + numMaior  + " Linha "+ linha + " Coluna " + coluna + "\n");
                }
            }
        }
        return posicoes;
    }
}
