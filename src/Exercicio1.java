public class Exercicio1 {
    public static void main(String[] args) {
        double[][] notasM = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        double [] notasVet = new double[notasM.length];
        for (int linha = 0; linha < notasM.length; linha++){
            int soma = 0;
            for (int coluna = 0; coluna < notasM[linha].length; coluna++){
                soma += notasM[linha][coluna];
            }
            notasVet[linha] += soma / notasM[linha].length;
            System.out.println("Media do aluno " + linha + " " + notasVet[linha]);
        }
        double mediaSoma = 0;
        for (int cont = 0; cont < notasVet.length; cont++){
            mediaSoma += notasVet[cont];
        }
        double mediaTurma = mediaSoma/notasVet.length;
        System.out.println("Media total " + mediaTurma);
    }
}
