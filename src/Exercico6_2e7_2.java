public class Exercico6_2e7_2 {
    public static void main(String[] args) {
        int [][] numM = {
            {0, 1 ,2 ,3},
            {1, 0, 2 ,3},
            {1, 2, 0 ,3},
            {1, 2 ,3 ,0}
        };
        int [][] numMIdent = {
            {1, 1, 0 ,0},
            {0, 1, 0 ,0},
            {0, 0, 1, 0},
            {0, 0, 0 ,1}
        };
        System.out.println(VerificarDiagonal(numM));
        System.out.println(VerificarIdentidade(numMIdent));
    }
    public static String VerificarDiagonal(int [][] m){
        for (int l = 0; l < m.length; l++){
            for (int c = 0; c < m[l].length; c++){
                if (c == l){
                    if(m[l][c] == 0){
                        return "É uma matriz diagonal";
                    }
                    else{
                        return "Não é uma matriz diagonal";
                    }
                }
            }
        }
        return "1";
    }
    public static String VerificarIdentidade(int [][] m){
        for(int l = 0; l < m.length; l++){
            for (int c = 0; c < m[0].length; c++){
                if (c != l){
                    if (m[l][c] == 0){
                        return "Tem identidade";
                    }
                    else {
                        return "Não tem identidade";
                    }
                }
            }
        }
        return "1";
    }
}
