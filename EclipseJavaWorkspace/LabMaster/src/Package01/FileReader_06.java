package Package01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class FileReader_06 {
    public static void main(String[] args){
        var file01 = new File("test.txt");
        System.out.println("\n\nPrinting out lines from " + file01.toString() + "\n\n");
        try(var bufferedReader01 = new BufferedReader(new FileReader(file01))){
            String line;
            while( (line=bufferedReader01.readLine() ) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){

        }
        catch (IOException e){

        }
        System.out.println("\n\nEnd of file reached\n\n");

    }
}
