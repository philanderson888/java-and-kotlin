package Package01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[] args){
        // Note that List<T> is abstract so have to instantiate ArrayList

        File file01 = new File("test.txt");
        List<String> list01 = new ArrayList();
        try {
            var fileReader01 = new FileReader(file01);
            var bufferedReader01 = new BufferedReader(fileReader01);
            String line;
            while((line = bufferedReader01.readLine())!=null){
                System.out.println(line);
                list01.add(line);
            }
        }
        catch (
                FileNotFoundException ex){
            System.out.println("File not found " + file01.toString());
        }
        catch (
                IOException ex){
            System.out.println("Could not read file " + file01.toString());
        }
        catch (Exception ex){}

        for (String item : list01){
            System.out.println(item);
        }



        for(String item : list01){
            System.out.println(item.toString());
        }

    }

}
