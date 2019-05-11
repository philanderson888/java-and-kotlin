package Package01;
import java.util.*;

public class Set_01 {
    public static void main(String[] args) {
        System.out.println("\n\nHash Set : no particular order");
        var myHashSet = new HashSet<String>();
        UseSet(myHashSet);

        System.out.println("\n\nLinked Hash Set : order of insertion");
        var myLinkedHashSet = new LinkedHashSet<String>();
        UseSet(myLinkedHashSet);

        System.out.println("\n\nTree Set : Natural Order");
        var myTreeSet = new TreeSet<String>();
        UseSet(myTreeSet);

        System.out.println("\n\nEmpty Set");
        var myEmptySet = new TreeSet<String>();
        if (myEmptySet.isEmpty())
            System.out.println("Set is empty");


        System.out.println("\n\nIntersection Of 2 Sets : Get ITems Common In Both");
        myHashSet.add("four");
        myHashSet.add("five");
        var intersectionSet = new HashSet<String>(myHashSet);
        System.out.println(intersectionSet);
        intersectionSet.retainAll(myTreeSet);
        System.out.println(intersectionSet);

        System.out.println("\n\nGet Differences Between 2 Sets");
        var differenceSet = new HashSet<String>(myHashSet);
        differenceSet.removeAll(myTreeSet);
        System.out.println(differenceSet);

    }

    static void UseSet(Set<String> set){
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");  // no effect as no duplicates

        System.out.println(set);

        for(String element : set){
            System.out.printf("\nElement is %s",element);
        }

        if(set.contains("two")){
            System.out.println("\nYes, contains item two");
        }



    }
}
