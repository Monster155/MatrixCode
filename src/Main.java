public class Main {
    public static void main(String[] args) {
        int k = 2;
        for (int i = 0; i < 20; i++) {
            System.out.println(k + "   " + calculateTime(k));
            k *= 2;
        }
    }

    private static long calculateTime(int size) {
        long startTime = System.currentTimeMillis();
        int[][] mat = new int[size][size];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i * mat.length + j;
            }
        }

        MatrixCode matrixCode = new MatrixCode(mat);
        matrixCode.transp();
        mat = matrixCode.decode();

        return System.currentTimeMillis() - startTime;
    }
}
