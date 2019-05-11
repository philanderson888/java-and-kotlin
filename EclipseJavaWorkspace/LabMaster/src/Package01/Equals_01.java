package Package01;

class MyClass{
    private int id;
    private String name;
    public MyClass(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public  boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        var other = (MyClass)obj;
        if(this.id!=other.id){
            return false;
        }
        if(this.name!=other.name){
            return false;
        }
        return true;
    }
}

public class Equals_01 {
    public static void  main(String[] args){
        var instance01 = new MyClass(10,"name02");
        var instance02 = new MyClass(10,"name02");
        System.out.println(instance01.equals(instance02));

        var string01 = "hello";
        var string02 = "helloWorld".substring(0,5);
        System.out.println(string01==string02);


        var double01 = 1.23;
        var double02 = 0.23+1;
        System.out.println(double01==double02);
    }
}
