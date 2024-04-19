import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public void readFileData(String path, int textUnits){
        String [] data = new String[textUnits];
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                for(int i = 0; i < textUnits; i++){
                    String line = scan.nextLine();
                    data[i] = line;
                    data = line.split(";", 4);

                    for (int y = 0; y < data.length; y++) {
                        System.out.println(data[y]);
                    }
                    System.out.println("\n");
                }
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
