import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    private String dataFile = "UserAccountData.txt";

    public void readFileData(String path, int textUnits){
        String [] data = new String[textUnits];
        File file = new File(path);

        try {
            File textFile = new File(path);
            Scanner scan = new Scanner(textFile);


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


/*
    public void saveUserData(ArrayList<Users> user, String path){

    }
*/
    public boolean checkCredentials(String email, String password) {
        try (Scanner scanner = new Scanner(new FileReader(dataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(email) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to check credentials: " + e.getMessage());
        }
        return false;
    }

    public boolean isUserExists(String email) {
        try (Scanner scanner = new Scanner(new FileReader(dataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length == 2 && parts[0].equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to check if user exists: " + e.getMessage());
        }
        return false;
    }

    public void registerUser(String email, String password) {
        try (FileWriter writer = new FileWriter(dataFile, true)) {
            writer.write(email + "," + password + "\n");
        } catch (IOException e) {
            System.out.println("Failed to register user: " + e.getMessage());
        }
    }




}
