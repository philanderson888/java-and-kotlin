package Package01;

class TempObject implements AutoCloseable{
    @Override
    public  void close() throws Exception{
        System.out.println("Closing");
    }
}

public class Try_With_Resources_01 {
    public static void main(String[] args){

        var tempObject01 = new TempObject();
        try {
            tempObject01.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        // can replace with
        System.out.println("Note that this structure auto-closes tempObject2 without us asking");
        try(var tempObject02 = new TempObject()){

        }
        catch (Exception e){

        }


    }
}
