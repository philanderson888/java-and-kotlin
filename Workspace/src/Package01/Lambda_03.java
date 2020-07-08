package Package01;

public class Lambda_03 {

    interface IDoThis{
        int doThis(int x);
    }

    static class MyClass{
        private int field01;
        int MyMethod(IDoThis e){
            int output = e.doThis(field01);
            System.out.println("Returning value " + output);
            return output;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running an application which is passing a lambda method into another method");
        System.out.println("This time we are returning an integer but also passing in an integer");
        var instance = new MyClass();
        instance.field01=22;
        instance.MyMethod( (x)->{
            System.out.println("Processing value " + x);
            return 100*x;
        });

    }
}
