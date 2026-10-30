

import java.util.Scanner;

public static void main(String[] args) {
    Scanner llegeix = new Scanner(System.in);

    System.out.print("Número de filas (n): ");
    int n = llegeix.nextInt();
    System.out.print("Número de columnas (m): ");
    int m = llegeix.nextInt();


    int[][] matriz = new int[n][m];
    int[] sumaColumnas = new int[m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("Elemento [" + i + "][" + j + "]: ");
            matriz[i][j] = llegeix.nextInt();
        }
    }


    for (int j = 0; j < m; j++) {
        for (int i = 0; i < n; i++) {
            sumaColumnas[j] += matriz[i][j];
        }
    }
    System.out.println("\nMatriz ingresada:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(matriz[i][j] );
        }
        System.out.println();
    }


    System.out.println("\nSuma de cada columna:");
    for (int j = 0; j < m; j++) {
        System.out.println("Columna " + j + ": " + sumaColumnas[j]);
    }

}


