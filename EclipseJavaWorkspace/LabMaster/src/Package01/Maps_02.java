package Package01;

import java.util.Objects;
import java.util.*;

class Person{
    public int Id;
    public String name;
    public Person(int Id, String name){
        this.Id = Id;
        this.name = name;
    }
    public String toString(){
        return String.format("ID is %d and name is %d",this.Id,this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }
}


public class Maps_02 {

    static TreeMap<Integer,Person> map = new TreeMap<Integer,Person>();

    public static void main(String[] args) {

        var person01 = new Person(1,"John");
        var person02 = new Person(2,"Sue");
        var person03 = new Person(3,"Peter");

        PutPerson(person01);
        PutPerson(person02);
        PutPerson(person03);

        for(Integer key : map.keySet()){
            System.out.printf("\nItem with index/key %d has id of %d and name of %s",key,map.get(key).Id,map.get(key).name);
        }

    }

    static void PutPerson(Person p){
        map.put(p.Id,p);
    }
}
