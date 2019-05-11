package Package01;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_07 {
    public static void main(String[] args){
        var file01 = new File("test.txt");
        try(var bufferedWriter01 = new BufferedWriter(new FileWriter(file01, true))){
            bufferedWriter01.write("\nThis is line 01");
            bufferedWriter01.write("\nThis is line 02");
            bufferedWriter01.newLine();
            bufferedWriter01.write("\nLast line\n");
        }
        catch (IOException e){}

    }
}
