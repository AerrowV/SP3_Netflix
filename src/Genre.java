import java.util.ArrayList;
import java.util.Scanner;

public class Genre {
    private NetflixMenu menu = new NetflixMenu();
    private FileIO file = new FileIO();
    private ArrayList<String> genre = new ArrayList<>();

    public ArrayList<String> getGenre() {
        return genre;
    }


    public String mediaWithThisGenre() {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    switch (input) {

        case "1":
            System.out.println("Media with History genre");
            /*
            for(MediaData mediaDataChoice: objekt.getSearchMedia()){
                mediaDataChoice.equals(objekt2.readFileData("Files/Movie.txt"));
            }*/
            //for (int i = 0; i < objekt2.readFileData("Files/Movie.txt").size(); i++) {
              //  objekt2.readFileData("Files/Movie.txt").trim();
            //}

            break;
        case "2":
            System.out.println("Media with Comedy genre");
            break;
        case "3":
            System.out.println("Media with War genre");
            break;
        case "4":
            System.out.println("Media with Romance genre");
            break;
        case "5":
            System.out.println("Media with Sport genre");
            break;
        case "6":
            System.out.println("Media with Crime genre");
            break;
        case "7":
            System.out.println("Media with Mystery genre");
            break;
        case "8":
            System.out.println("Media with Fantasy genre");
            break;
        case "9":
            System.out.println("Media with Science Fiction genre");
            break;
        case "10":
            System.out.println("Media with Biography genre");
            break;
        case "11":
            System.out.println("Media with Drama genre");
            break;
        case "12":
            System.out.println("Media with Adventure genre");
            break;
        case "13":
            System.out.println("Media with Family genre");
            break;
        case "14":
            System.out.println("Media with Thriller genre");
            break;
        case "15":
            System.out.println("Media with Horror genre");
            break;
        case "16":
            System.out.println("Media with Film-Noir genre");
            break;
        case "17":
            System.out.println("Media with Musical genre");
            break;
        case "18":
            System.out.println("Media with Action genre");
            break;
        case "19":
            System.out.println("Media with Western genre");
            break;
        case "20":
            System.out.println("Media with Animation genre");
            break;
        case "21":
            System.out.println("Media with Talk show genre");
            break;
        default:
            System.out.println("Invalid input");
            break;


    }
return "";
}
}
