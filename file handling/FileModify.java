import java.io.FileWriter;
import java.io.IOException;
public class FileModify {
    public static void main(String[] args) {
        try{
            FileWriter myFile= new FileWriter("Writer.txt",true);
            myFile.write("I am exicted to improve my skills and gain hands on experience.");
            myFile.close();
            System.out.println("Appended successfully");
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
