package Package01;

public class Pass_By_Ref_01 {

    public static void main(String[] args) {

        System.out.println("\nPassing Integers : A Copy Is Passed");
        int value = 7;
        System.out.printf("\nOriginal value is %d\n",value);
        var instance = new Pass_By_Ref_01();
        instance.DoThis(value);
        System.out.println();
        System.out.printf("\nValue in main is still %d",value);
        System.out.println("\n\n\n");

    }

    void DoThis(int value){
        value++;
        System.out.printf("\nValue in DoThis method is now %d",value);
    }




}
