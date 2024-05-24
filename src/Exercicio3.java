import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Exercicio3 {
    public static void main(String[] args) throws FileNotFoundException {
        String camArq = "NumInteiro.txt";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de linhas");
        int numLinhas = teclado.nextInt();
        System.out.println("Digite o número de colunas");
        int numColunas = teclado.nextInt();

        int [][] numIntM = new int[numLinhas][numColunas];

        File file = new File(camArq);
        Scanner scanner = new Scanner(file);
        for (int linha = 0; linha < numIntM.length; linha++){
            for (int coluna = 0; coluna < numIntM[linha].length; coluna++){
                if (scanner.hasNextInt()){
                    numIntM[linha][coluna] = scanner.nextInt();
                    System.out.printf("%d ", numIntM[linha][coluna]);
                }
            }
            System.out.println("\n");
        }
        scanner.close();

//        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número");
        int  numProcura = teclado.nextInt();
        StringBuilder posicoes = new StringBuilder();
        int linhaAchada = 0;
        int colunaAchada = 0;
        int numMaior = numIntM[0][0];
        for (int linha = 0; linha < numIntM.length; linha++){
            for (int coluna = 0; coluna < numIntM[linha].length; coluna++){
                if (numIntM[linha][coluna]>numMaior){
                    numMaior = numIntM[linha][coluna];
                }
            }
        }
        System.out.println("Maior número " + numMaior);
        for (int linha = 0; linha < numIntM.length; linha++){
            for (int coluna = 0; coluna < numIntM[0].length; coluna++){
                if (numIntM[linha][coluna] == numProcura){
                    linhaAchada = linha;
                    colunaAchada = coluna;
                    posicoes.append("Linha " + linha + " Coluna " + coluna + "\n");
                }
            }
            System.out.println("\n");
        }
        if (posicoes.isEmpty()){
            System.out.printf("Achei! está na linha %d, coluna %d", linhaAchada, colunaAchada);
        } else{
            System.out.println(posicoes);
        }
    }

}
