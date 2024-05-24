import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class NumAleatorios {
    public static void main(String[] args) throws IOException {
        String camArq = "NumInteiro.txt";
        FileWriter fileWriter = new FileWriter(camArq);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        Random random = new Random();
        for (int cont = 0; cont < 100; cont++){
            int aleatorio = Math.round(random.nextInt(10));
            printWriter.println(aleatorio);
            System.out.println(aleatorio);

        }
        fileWriter.close();
        printWriter.close();


    }
}
