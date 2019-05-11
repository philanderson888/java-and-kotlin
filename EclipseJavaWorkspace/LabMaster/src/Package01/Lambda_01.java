package Package01;



public class Lambda_01 {

    // Functional interface has just one method
    interface Executable{
        void execute();
    }

    static class Runner {
        public void run(Executable e) {
            e.execute();
        }
    }

    public static void main(String[] args) {

        // Before Java 8
        var runner = new Runner();
        runner.run(new Executable(){
            public void execute(){
                System.out.println("Executing code");
            }
        });

        // Java 8
        // Lambdas are always associated with Interfaces which have a single method!!!

        runner.run( () -> {
            System.out.println("Executing code from inside Lamba");
        });

    }
}
