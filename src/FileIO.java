import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<String> readFileData(String path){
        try {
            File textFile = new File(path);
            Scanner scan = new Scanner(textFile);
            while (scan.hasNextLine()) {

            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readUserData(ArrayList<Users> user, String path) {
        /*
        try {
            File textFile = new File(path);
            Scanner scan = new Scanner(textFile);
            while (scan.hasNextLine()) {

            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

*/
    }



    public void saveUserData(ArrayList<Users> user, String path){



    }


}
