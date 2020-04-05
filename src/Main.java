public class Main {
    public static void main(String[] args) {
        int k = 2;
        for (int i = 0; i < 20; i++) {
            System.out.println(k + "   " + calculateTime(k));
            k *= 2;
        }

    }

    private static long calculateTime(int size) {
        //create
        int[][] mat = new int[size][size];
        //fill
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i * mat.length + j;
            }
        }
        //create matrix code
        MatrixCode matrixCode = new MatrixCode(mat);
        //calculate time for transp()
        long startTime = System.currentTimeMillis();
        matrixCode.transp();
        return System.currentTimeMillis() - startTime;
    }
}
