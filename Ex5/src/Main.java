import java.util.Scanner;
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        double[][] m = new double[20][6];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Alumno " + (i + 1) + " - Nota " + (j + 1) + ": ");
                m[i][j] = llegir.nextDouble();
            }
        }

        for (int i = 0; i < 20; i++) {
            double suma = 0;
            m[i][4] = m[i][0];
            m[i][5] = m[i][0];
            for (int j = 0; j < 3; j++) {
                suma += m[i][j];
                if (m[i][j] > m[i][4]) m[i][4] = m[i][j];
                if (m[i][j] < m[i][5]) m[i][5] = m[i][j];
            }
            m[i][3] = suma / 3;
        }

        System.out.println("Nota1 Nota2 Nota3 Prom Mayor Menor");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%.2f", m[i][j]);
            }
            System.out.println();
        }

        double mejor = m[0][4];
        double peor = m[0][5];
        for (int i = 1; i < 20; i++) {
            if (m[i][4] > mejor) mejor = m[i][4];
            if (m[i][5] < peor) peor = m[i][5];
        }

        System.out.printf("%nMejor nota del curso: %.2f%n", mejor);
        System.out.printf("Peor nota del curso: %.2f%n", peor);
    }
