package Package01;


import java.util.Objects;

enum Fruits{

    banana,pear,apple

}


public class Enum_01 {


    public static void main(String[] args){

        System.out.println(Fruits.banana);

        var fruit01 = Fruits.banana;

        switch (fruit01){
            case banana:
                break;
            case pear:
                break;
            case apple:
                break;
        }

    }
}

