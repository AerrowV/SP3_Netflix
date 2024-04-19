import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Genre {



    private ArrayList<String> genre;

    public Genre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }
public void genreList(){

    genre.add("History");
    genre.add("Comedy");
    genre.add("Sci-Fi");
    genre.add("War");
    genre.add("Romance");
    genre.add("Sport");
    genre.add("Crime");
    genre.add("Mystery");
    genre.add("Fantasy");
    genre.add("Science Fiction");
    genre.add("Biography");
    genre.add("Drama");
    genre.add("Adventure");
    genre.add("Family");
    genre.add("Thriller");
    genre.add("Horror");
    genre.add("Film-Noir");
    genre.add("Musical");
    genre.add("Action");
    genre.add("Western");
    genre.add("Animation");
    genre.add("Talk Show");


}


public String chooseGenre() {

    Scanner scanner = new Scanner();
    String input = scanner.nextLine();

    switch () {

        case 1:


    }


}
}
