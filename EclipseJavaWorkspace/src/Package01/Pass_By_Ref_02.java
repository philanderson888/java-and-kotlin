package Package01;

class Parent03{
    public int field01;
}

public class Pass_By_Ref_02 {
    public static void main(String[] args) {
        System.out.println("Passing values into a method : original item is modified");
        var p01 = new Parent03();
        p01.field01 = 27;
        System.out.printf("\nInitial value of field01 is %d",p01.field01);
        DoThis(p01);
        System.out.printf("\nFinal value of field01 is %d",p01.field01);
    }

    static void DoThis(Parent03 p){
        p.field01++;
        System.out.printf("\nValue of field01 in DoThis method has become %d",p.field01);
    }
}

