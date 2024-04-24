import java.util.ArrayList;

public class Season {
    private String seasonNumber;
    ArrayList<Episode> episodes = new ArrayList<>();

    public Season(String seasonInfo) {
        String[] parts = seasonInfo.split("-Episode ");
        this.seasonNumber = parts[0].trim();
        int episodeCount = Integer.parseInt(parts[1].trim());
        for (int i = 1; i <= episodeCount; i++) {
            episodes.add(new Episode(i));

        }
    }


    @Override
    public String toString() {
        return seasonNumber;
    }
}