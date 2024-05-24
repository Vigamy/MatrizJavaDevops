import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Exercicio1_2 {
    public static void main(String[] args) {
        boolean continaur = true;
        do {
            try{
                String camArq = "NumInteiro.txt";
                Scanner teclado = new Scanner(System.in);
                System.out.println("Digite o número de linhas");
                int linha = teclado.nextInt();
                System.out.println("Digite o número de colunas");
                int coluna = teclado.nextInt();
                double [][] numM = new double[linha][coluna];
                teclado.close();

                File file = new File(camArq);
                Scanner scanner = new Scanner(file);

                for (int linhaFor = 0; linhaFor < numM.length ; linhaFor++){
                    for (int colunaFor = 0; colunaFor < numM[0].length; colunaFor++){
                        numM[linhaFor][colunaFor] = scanner.nextInt();
                        System.out.printf("%.2f ", numM[linhaFor][colunaFor]);
                    }
                    System.out.println("\n");
                }
                double soma = 0;
                System.out.println("\n");
                for (int linhaFor = 0; linhaFor < numM.length ; linhaFor++){
                    for (int colunaFor = 0; colunaFor < numM[linhaFor].length; colunaFor++){
                        soma += numM[linhaFor][colunaFor];
                        System.out.println(soma);
                        if (colunaFor == numM.length){
                            soma = soma / numM[linhaFor].length;
                            System.out.println(soma);
                            for (int coluna1 = 0; coluna1 < numM.length+1; coluna1++){
                                    numM[linhaFor][coluna1] = soma;
                            }
                        }
                    }
                    System.out.println("\n");
                }
                for (int linhaFor = 0; linhaFor < numM.length ; linhaFor++){
                    for (int colunaFor = 0; colunaFor < numM[linhaFor].length; colunaFor++){
                        System.out.printf("%.2f ", numM[linhaFor][colunaFor]);
                    }
                    System.out.println("\n");
                }
                continaur = false;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } while (continaur);
    }
}
