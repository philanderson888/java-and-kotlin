package Package01;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReader_01 {
    public static void main(String[] args) {
        var file01 = new File("testFileIntegers.txt");
        int char01;
        System.out.println("Reading individual characters one at a time from a text file with FileReader.read()");
        System.out.println("Seeing this way explains why we need buffered reader to speed up the process of reading data");
        try (var fileReader01 = new FileReader(file01)) {
            do  {
                char01 = fileReader01.read();
                System.out.printf("ASCII number is %d which is character %s\n\r",char01,(char)char01);
            }
            while(char01 != -1);
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
