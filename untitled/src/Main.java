public static void main(String[] args) {
        char[][] m = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    m[i][j] = 'X';
                } else {
                    m[i][j] = ' ';
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
}
