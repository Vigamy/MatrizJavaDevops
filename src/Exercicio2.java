import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Exercicio2 {
    public static void main(String[] args) {
        try{
            double [][] notasM= new double[4][25];
            String caminhoarq = "NotasAlunos.txt";
            File file = new File(caminhoarq);
            Scanner scanner = new Scanner(file);
            for (int linha = 0; linha < notasM.length; linha++){
                for (int coluna = 0; coluna < notasM[linha].length; coluna++){
                    if (scanner.hasNextDouble()){
                        notasM[linha][coluna] = scanner.nextDouble();
                        System.out.printf("%.2f   ",notasM[linha][coluna]);
                    }
                }
                System.out.println("\n");

            }
            scanner.close();
            for (int linha = 0; linha < notasM.length; linha++) {
                double soma = 0;
                int divisor = 0;
                double mediaProva = 0;
                for (int coluna = 0; coluna < notasM[linha].length; coluna++) {
                    soma += notasM[linha][coluna];
                    divisor++;
                }
            mediaProva = soma / divisor;
            System.out.printf("Media da prova %d é %.2f\n", linha, mediaProva);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
