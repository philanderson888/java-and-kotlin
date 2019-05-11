package Package01;


public class Lambda_02 {

    interface IDoThis{
        int doThis();
    }
    // my class
    static class DoSomething{
        // method in my class which accepts as a parameter an instance of a class which implements IDoThis
        public void doSomething(IDoThis e){
            int value = e.doThis();   // now calling the method of this implemented class
            System.out.println("Method run is now returning " + value);
        }
    }

    public static void main(String[] args) {
        System.out.println("Running a program which is passing a lambda method as a parameter, but returning an integer as well");
        var instance01 = new DoSomething();
        instance01.doSomething( () -> {
                return 55;
        });

    }
}
