public class Main {
    public static void main(String[] args) {
        int [][] m = {{-4,76,89}, {17,36,81},{2,45,53},{12,17,25},{65,-34,47}};
//        for(int linha = 0; linha < m.length; linha++){
//            for(int coluna = 0; coluna < m[linha].length; coluna++){
//                System.out.printf("%4d",m[linha][coluna]);
//            }
//            System.out.println("\n");
//        }
        double[][] notasM = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        double[] mediaAluno = new double[notasM.length];

        for (int linha = 0; linha < notasM.length; linha++) {
            double soma = 0;
            for (int coluna = 0; coluna < notasM[linha].length; coluna++) {
                soma += notasM[linha][coluna];
            }
            mediaAluno[linha] = soma / notasM[linha].length;
            System.out.println(mediaAluno[linha]);
        }

        double somaMedia = 0;

        for (int cont = 0; cont < mediaAluno.length; cont++) {
            somaMedia += mediaAluno[cont];
        }

        double mediaTurma = somaMedia / mediaAluno.length;
        System.out.println("Média do aluno: " + mediaTurma);

        for(int coluna = 0; coluna < notasM[coluna].length;coluna++){
            double somaMediaSala = 0;
            for (int linha = 0; linha < notasM.length; linha++){
                somaMediaSala += notasM[coluna][linha];
            }
            mediaAluno[coluna] = somaMediaSala/notasM.length;
            System.out.println(mediaAluno[coluna]);
        }
    }
}