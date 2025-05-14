
/*
Matriz*/
public class Matriz {
    public static void main(String[] args) {
       
        int[][] matriz = new int[3][3];
       
        matriz[0][0] = 5;
        matriz[0][1] = 3;
        matriz[0][2] = 2;
       
        matriz[1][0] = 4;
        matriz[1][1] = 3;
        matriz[1][2] = 6;
       
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 1;

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    return 0;
}