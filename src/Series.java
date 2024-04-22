import java.util.ArrayList;

public class Series extends MediaData implements Media{
    private ArrayList<Season> seasonEpisode;

    public Series(String name, String releaseYear, String genre, float rating, ArrayList<Season> seasonEpisode) {
        super(name, genre, releaseYear, rating);
        this.seasonEpisode = seasonEpisode;

    }

    public ArrayList<Season> getSeasonEpisode() {
        return seasonEpisode;
    }

    @Override
    public void resumePlay() {
        System.out.println("Resuming series: " + getName());
    }

    @Override
    public void stopPlay() {
        System.out.println("Stopping series: " + getName());
    }

    @Override
    public void pausePlay() {
        System.out.println("Pausing series: " + getName() + " , " + getSeasonEpisode());
    }

    @Override
    public String toString() {
        return getName() + " / " + getReleaseYear() +  " / "  + getGenre()  + " / " + getRating();
    }

    @Override
    public int compareTo(MediaData o) {
        return this.getName().compareTo((o).getName());
    }
}
