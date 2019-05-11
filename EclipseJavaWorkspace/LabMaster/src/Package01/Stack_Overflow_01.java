package Package01;

public class Stack_Overflow_01 {
    public static void main(String[] args){

        // counts to about 10,000 before it crashes so relatively small Stack memory size
        calculate(0);

    }

    public static void calculate(int x){
        System.out.println(x);
        calculate(x+1);
    }
}
