package Package01;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader_05 {

    public static void main(String[] args){

        File file01 = new File("test.txt");
        List<String> list01 = new ArrayList();
        BufferedReader bufferedReader01 = null;

        try {
            var fileReader01 = new FileReader(file01);
            bufferedReader01 = new BufferedReader(fileReader01);
            String line;
            while((line = bufferedReader01.readLine())!=null){
                System.out.println(line);
                list01.add(line);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found " + file01.toString());
        }
        catch (IOException ex){
            System.out.println("Could not read file " + file01.toString());
        }
        catch (Exception ex){}
        finally{
            try {
                bufferedReader01.close();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        for (String item : list01){
            System.out.println(item);
        }
    }
}
