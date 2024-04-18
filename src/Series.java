import java.util.ArrayList;

public class Series extends MediaData implements Media{


    public Series(String name, String genre, int realeaseYear, int rating, ArrayList<String> seasons, ArrayList<String> episodes) {
        super(name, genre, realeaseYear, rating);
        seasons = new ArrayList<>();
        episodes = new ArrayList<>();

    }

    @Override
    public void resumePlay() {

    }

    @Override
    public void stopPlay() {

    }

    @Override
    public void pausePlay() {

    }
}
