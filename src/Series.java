import java.util.ArrayList;

public class Series extends MediaData implements Media{
    private ArrayList<String> season;
    private ArrayList<String> episode;

    public Series(String name, String genre, int releaseYear, int rating, ArrayList<String> season, ArrayList<String> episode) {
        super(name, genre, releaseYear, rating);
        this.season = season;
        this.episode = episode;

    }

    @Override
    public void resumePlay() {

    }

    @Override
    public void stopPlay() {
        System.out.println("Stopping series: " + getName());
    }

    @Override
    public void pausePlay() {

    }
}
