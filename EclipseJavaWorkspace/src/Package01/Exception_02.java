package Package01;


import java.io.IOException;
import java.text.ParseException;

public class Exception_02 {

    public static void main(String args[]){

        try{
            if (1>2)
                throw new ParseException("Error in list of commands",2 );
            else
                throw new IOException("Error in IO file read");
        }
        catch (IOException | ParseException ex){

        }



    }


}
