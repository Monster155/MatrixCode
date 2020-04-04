public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
