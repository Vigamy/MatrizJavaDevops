import java.io.FileNotFoundException;
import java.net.CacheRequest;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.io.File;
public class Exercicio2_2 {
    public static void main(String[] args) throws FileNotFoundException {
        boolean continuar = true;
        do {
            try{
                String camArq = "numInteiro.txt";
                File file = new File(camArq);
                Scanner scanner = new Scanner(file);
                int linhaTamanho = 4;
                int colunaTamanho = 5;
                int [][] numM = new int[linhaTamanho][colunaTamanho];
                for (int linha = 0; linha < numM.length; linha++){
                    for (int coluna = 0; coluna < numM[linha].length; coluna++){
                        numM[linha][coluna] = scanner.nextInt();;
                        System.out.printf("%d ", numM[linha][coluna]);
                        }
                    System.out.println("\n");
                    }
                scanner.close();
                Scanner teclado = new Scanner(System.in);
                for (int cont = 0; cont < colunaTamanho; cont++){
                    int [] numero = CalcularSoma(numM);
                    System.out.println("Matriz de valores " + numero[cont] );
                }
                continuar = false;
                } catch (InputMismatchException ime){
                    System.out.println(ime.getMessage());
                }
            } while (continuar);
        }


        public static int [] CalcularSoma(int [][] matrizM){
            int soma = 0;
            int colunaTamanho = matrizM[0].length;
            int [] vetSoma = new int[colunaTamanho];
            for (int coluna = 0; coluna < matrizM[1].length; coluna++){
                soma = 0;
                for (int linha = 0; linha < matrizM.length; linha++){
                    soma += matrizM[linha][coluna];
                }
                vetSoma[coluna] = soma;
            }
            return vetSoma;
        }
    }
