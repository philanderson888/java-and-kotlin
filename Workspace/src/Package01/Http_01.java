package Package01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Http_01 {
    public static void main(String[] args) {

        var stringBuilder = new StringBuilder();

        try{
            var url = new URL("https://www.bbc.co.uk/news");
            var bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            while( (line=bufferedReader.readLine())!=null){
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
            bufferedReader.close();
        }

        catch(Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }

        System.out.println(stringBuilder);



    }
}
