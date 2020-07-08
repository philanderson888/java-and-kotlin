package Package01;

public class Pass_By_Reference_03 {
    public static void main(String[] args) {
        Integer i01 = 54;
        System.out.printf("\n\nInitial value of integer is %d",i01);
        DoThis(i01);
        System.out.printf("\n\nFinal value of integer is %d", i01);

    }
    static void DoThis(Integer i){
        i++;
        System.out.printf("\n\nValue of integer inside DoThis has become %d", i);
    }
}
