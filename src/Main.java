import java.io.*;

public class Main {
    public static void main(String[] args) {
        int k = 2;
        String[] names = new String[]{"decode", "insert", "delete", "minList", "sumDiag", "transp", "sumCols"};
        for (int i = 1; i < 8; i++) {
            print(names[i - 1]);
            k = 2;
            for (int j = 0; j < 12; j++) {
                print(k);
                k *= 2;
            }
            print("______________");
            k = 2;
            for (int j = 0; j < 12; j++) {
                print(calculateTime(k, i));
                k *= 2;
            }
        }
    }

    private static long calculateTime(int size, int numOfFunction) {
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

        long startTime;
        switch (numOfFunction) {
            case 1:
                startTime = System.currentTimeMillis();
                matrixCode.decode();
                return System.currentTimeMillis() - startTime;
            case 2:
                startTime = System.currentTimeMillis();
                matrixCode.insert(mat.length - 1, mat.length - 1, 1);
                return System.currentTimeMillis() - startTime;
            case 3:
                startTime = System.currentTimeMillis();
                matrixCode.delete(mat.length - 1, mat.length - 1);
                return System.currentTimeMillis() - startTime;
            case 4:
                startTime = System.currentTimeMillis();
                matrixCode.minList();
                return System.currentTimeMillis() - startTime;
            case 5:
                startTime = System.currentTimeMillis();
                matrixCode.sumDiag();
                return System.currentTimeMillis() - startTime;
            case 6:
                //calculate time for transp()
                startTime = System.currentTimeMillis();
                matrixCode.transp();
                return System.currentTimeMillis() - startTime;
            default:
                startTime = System.currentTimeMillis();
                matrixCode.sumCols(1, mat.length - 1);
                return System.currentTimeMillis() - startTime;
        }
    }

    private static void print(int a) {
        try (FileWriter fw = new FileWriter("text.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void print(long a) {
        try (FileWriter fw = new FileWriter("text.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void print(String name) {
        try (FileWriter fw = new FileWriter("text.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}