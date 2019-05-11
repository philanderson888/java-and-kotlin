package Package01;

public class Stopwatch_01 {
    public static void main(String[] args) {
        var max = 100;
        System.out.println("Stopwatch");
        System.out.println("Starting Stopwatch");
        var startTime = System.nanoTime();
        System.out.println(System.nanoTime());

        for (int i = 1; i < max; i++) {
            System.out.printf("\n%15f",(System.nanoTime() - startTime)/1E6);
        }
        System.out.printf("\n\nCounting to %d took %f milliseconds",max,(System.nanoTime()-startTime)/1E6);


        System.out.println("\n\nCan repeat using System.currentTimeMillis() method");
        max = 100;
        System.out.println("Stopwatch");
        System.out.println("Starting Stopwatch");
        var startTimeMillis = System.currentTimeMillis();
        System.out.println(startTime);
        for (int i = 1; i < max; i++) {
            System.out.printf("\n%15d",System.currentTimeMillis() - startTimeMillis);
        }
        System.out.printf("\n\nCounting to %d took %d milliseconds",max,System.currentTimeMillis() - startTimeMillis);

        System.out.println("\n\nThere is quite a difference so we will have to look into this!!!\n\n");


    }
}
