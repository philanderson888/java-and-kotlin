package Package01;
import java.util.*;

public class Iterator_01 {
    public static void main(String[] args) {
        var myList = new LinkedList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");

        System.out.println("\n\nDeclaring a pointer to move, one item by one item, down my list");
        Iterator<String> myIterator = myList.iterator();

        while(myIterator.hasNext()){
            var item = myIterator.next();
            System.out.println(item);
            if (item=="two"){
                System.out.println("Removing item two");
                myIterator.remove();
            }
        }

        System.out.println("\n\n\nNow iterating once more\n");
        Iterator<String> myIterator2 = myList.iterator();
        while(myIterator2.hasNext()){
            System.out.println(myIterator2.next());

        }

    }
}
