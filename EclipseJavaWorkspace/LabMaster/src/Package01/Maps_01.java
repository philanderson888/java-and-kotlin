package Package01;
import java.util.*;

public class Maps_01 {
    public static void main(String[] args) {

        System.out.println("Hashmap : keys not in any fixed order");
        System.out.println("LinkedHashMap : keys in order of insertion");
        System.out.println("TreeMap : keys in natural order");

        var hashMap = new HashMap<Integer,String>();
        var linkedHashMap = new LinkedHashMap<Integer,String>();
        var treeMap = new TreeMap<Integer,String>();

        System.out.println("\n\nHashMap : no fixed order");
        UseMap(hashMap);
        System.out.println("\n\nLinkedHashMap : order of insertion");
        UseMap(linkedHashMap);
        System.out.println("\n\nTreeMap : natural order of key");
        UseMap(treeMap);

    }

    static void UseMap(Map<Integer,String> map){
        map.put(9,"nine");
        map.put(4,"foun");
        map.put(0,"six");
        map.put(1,"one");
        map.put(50,"fifty");

        for(Integer key : map.keySet()){
            System.out.printf("\nItem with index %d has value %s",key,map.get(key));
        }
    }
}
