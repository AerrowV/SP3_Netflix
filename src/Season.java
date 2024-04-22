import java.util.ArrayList;
import java.util.List;

public class Season {
    private String seasonNumber;
    ArrayList<Episode> episodes = new ArrayList<>();

    public Season(String seasonInfo) {
        String[] parts = seasonInfo.split("-Episode ");
        if (parts.length == 2) {
            this.seasonNumber = parts[0].trim();
            int episodeCount = Integer.parseInt(parts[1].trim());
            for (int i = 1; i <= episodeCount; i++) {
                episodes.add(new Episode(i));
            }
        }
    }


    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }


    public String getSeasonNumber() {
        return seasonNumber;

    }
    @Override
    public String toString() {
        return "Season " + seasonNumber;
    }
}