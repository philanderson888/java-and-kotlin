package Package01;
import java.io.*;


class SerializeMe implements Serializable {
    private int id;
    private String name;
    public SerializeMe(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Serialize_01 {
    public static void main(String[] args){
        System.out.println("\n\nWriting data to file");
        var instance01 = new SerializeMe(1,"hi");
        var instance02 = new SerializeMe(2,"there");
        try(var fileOutputStream = new FileOutputStream("data.bin")){
            var outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(instance01);
            outputStream.writeObject(instance02);
            outputStream.close();
            System.out.println("\n\nFile \'data.bin\' successfully created");

        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
        System.out.println("\n\nNow reading the file back");
        try(var fileInputStream = new FileInputStream("data.bin")){
            var inputStream = new ObjectInputStream(fileInputStream);
            var returnedInstance01 = (SerializeMe)inputStream.readObject();
            var returnedInstance02 = (SerializeMe)inputStream.readObject();
            System.out.println(returnedInstance01.getId() + "  " + returnedInstance01.getName());
            System.out.println(returnedInstance02.getId() + "  " + returnedInstance02.getName());
            inputStream.close();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}






