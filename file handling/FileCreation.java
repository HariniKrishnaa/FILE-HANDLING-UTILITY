import java.io.File;
import java.io.IOException;
public class FileCreation{
    public static void main(String[] args){
        try{
            File myFile=new File("create.txt");

            if(myFile.createNewFile()){
                System.out.println("File created : "+myFile.getName());
            }
            else{
                System.out.println("File already exsits");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}