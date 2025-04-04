import java.io.FileReader;
import java.io.IOException;
public class FileRead {
    public static void main(String[] args) {
        try{
            FileReader myFile=new FileReader("Reader.txt");
            int character;
            while ((character = myFile.read())!=-1) {
                System.out.println("ASCII VALUE = "+character + "| Character = "+(char) character);
            }
            myFile.close();
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
