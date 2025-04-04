import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter myFile =new FileWriter("Writer.txt");
            myFile.write("I am learning file handling for the first time.\n I recently got an internship at CODTECH IT SOLUTIONS, \n where my first task is to work with file handling . This is a new and exciting\n experience for me.I beleive learning will help me in my programming journey. ");
            myFile.close();
            System.out.println("Sucessfully written in the file");
        }

        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
