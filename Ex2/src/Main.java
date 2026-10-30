import java.util.Scanner;

    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.print("Columnas (m): ");
        int m = llegir.nextInt();

        int[][] matriz = new int[3][m];
        int[][] num = new int[3][m];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = llegir.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            num[1][j] = matriz[0][j];
            num[2][j] = matriz[0][j];
            for (int i = 0; i < 3; i++) {
                num[0][j] += matriz[i][j];
                if (matriz[i][j] > num[1][j]) num[1][j] = matriz[i][j];
                if (matriz[i][j] < num[2][j]) num[2][j] = matriz[i][j];
            }
        }

        System.out.println("Suma / Mayor / Menor por columna:");
        for (int A = 0; A < 3; A++) {
            for (int j = 0; j < m; j++) {
                System.out.print(num[A][j]);
            }
            System.out.println();
        }
    }
