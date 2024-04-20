import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {


    public ArrayList<String> readFileData(String path){
        ArrayList<String> mediaData = new ArrayList<>();
        try {
            File textFile = new File(path);
            Scanner scan = new Scanner(textFile);

                while (scan.hasNextLine()) {
                    mediaData.add(scan.nextLine());
                    }
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        return mediaData;
        }

    public void readUserData(ArrayList<User> user, String path) {
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


/*
    public void saveUserData(ArrayList<Users> user, String path){

    }
*/




}
