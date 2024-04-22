import java.util.ArrayList;
import java.util.Scanner;

public class Genre {
    private ArrayList<String> genre = new ArrayList<>();

    public ArrayList<String> getGenre() {
        return genre;
    }


    public String mediaWithThisGenre() {
    TextUI text = new TextUI();
        text.askForGenre();

    boolean whileKey = false;

    while(whileKey == false){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
    switch (input) {

        case "1":
            System.out.println("Media with History genre");
            whileKey = true;
            return "History";
        case "2":
            System.out.println("Media with Comedy genre");
            whileKey = true;
            return "Comedy";
        case "3":
            System.out.println("Media with War genre");
            whileKey = true;
            return "War";
        case "4":
            System.out.println("Media with Romance genre");
            whileKey = true;
            return "Romance";
        case "5":
            System.out.println("Media with Sport genre");
            whileKey = true;
            return "Sport";
        case "6":
            System.out.println("Media with Crime genre");
            whileKey = true;
            return "Crime";
        case "7":
            System.out.println("Media with Mystery genre");
            whileKey = true;
            return "Mystery";
        case "8":
            System.out.println("Media with Fantasy genre");
            whileKey = true;
            return "Fantasy";
        case "9":
            System.out.println("Media with Science Fiction genre");
            whileKey = true;
            return "Science Fiction";
        case "10":
            System.out.println("Media with Biography genre");
            whileKey = true;
            return "Biography";
        case "11":
            System.out.println("Media with Drama genre");
            whileKey = true;
            return "Drama";
        case "12":
            System.out.println("Media with Adventure genre");
            whileKey = true;
            return "Adventure";
        case "13":
            System.out.println("Media with Family genre");
            whileKey = true;
            return "Family";
        case "14":
            System.out.println("Media with Thriller genre");
            whileKey = true;
            return "Thriller";
        case "15":
            System.out.println("Media with Horror genre");
            whileKey = true;
            return "Horror";
        case "16":
            System.out.println("Media with Film-Noir genre");
            whileKey = true;
            return "Film-Noir";
        case "17":
            System.out.println("Media with Musical genre");
            whileKey = true;
            return "Musical";
        case "18":
            System.out.println("Media with Action genre");
            whileKey = true;
            return "Action";
        case "19":
            System.out.println("Media with Western genre");
            whileKey = true;
            return "Western";
        case "20":
            System.out.println("Media with Animation genre");
            whileKey = true;
            return "Animation";
        case "21":
            System.out.println("Media with Talk show genre");
            whileKey = true;
            return "Talk show";
        default:
            System.out.println("Invalid input, please try again");
            break;
    }
    }

return "";
}

    public void searchGenre(){
        NetflixMenu menu = new NetflixMenu();
        String chosenGenre = mediaWithThisGenre();

        for (int i = 0; i < menu.getMovieList().size(); i++) {
            String movieGenre = menu.getMovieList().get(i).genre;
            String[] genres = movieGenre.split(",");

            // Fejlen med searchGenre ligger højst sandsynligt her
            for (int j = 0; j < genres.length; j++) {
                if(genres[j].trim().equals(chosenGenre)){
                    System.out.println(menu.getMovieList().get(i));
                } else {
                    System.out.println("There are no movies in this genre");
                    mediaWithThisGenre();
                }
            }
        }
    }
}
