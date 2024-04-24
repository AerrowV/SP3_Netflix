import java.util.ArrayList;
import java.util.Scanner;

public class Series extends MediaData implements Media {
    private ArrayList<Season> seasonEpisode;


    public Series(String name, String releaseYear, String genre, float rating, ArrayList<Season> seasonEpisode, int ID) {
        super(name, genre, releaseYear, rating, ID);
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
        System.out.println("Pausing series: " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing series: " + getName());
    }

    public void seasonsInitializer() {
        TextUI ui = new TextUI();
        for (Season season : seasonEpisode) {
            ui.displayMsg("Select a season: " + season);
        }
    }

    public void selectEpisode() {
        TextUI ui = new TextUI();
        Season sc = selectSeason();
        for (Episode ep : sc.episodes) {
            ui.displayMsg("Select an episode: " + ep);
        }
        String choice = ui.userInput();
        if (Integer.parseInt(choice) < sc.episodes.size()) {
            ui.displayMsg(sc.episodes.get(Integer.parseInt(choice) - 1) + " selected");

        }
    }

    public Season selectSeason() {
        TextUI ui = new TextUI();
        seasonsInitializer();
        ui.displayMsg("\nType season number to select a season");
        String userChoice = ui.userInput();
        if (Integer.parseInt(userChoice) < seasonEpisode.size()) {
            ui.displayMsg(seasonEpisode.get(Integer.parseInt(userChoice) - 1) + " selected");

        }
        return seasonEpisode.get(Integer.parseInt(userChoice) - 1);

    }

    public void seriesOptions() {
        boolean whileKey = true;
        TextUI ui = new TextUI();
        StartMenu startMenu = new StartMenu();
        FileIO fileIO = new FileIO();
        ui.displayMsg("1: Play episode\n" + "2: Resume\n" + "3: Stop\n" + "4: Pause\n" + "5: Next episode\n" + "6: Return to menu");
        while (whileKey) {
            String userChoice = ui.userInput();
            switch (userChoice) {
                case "1":
                    play();
                    break;
                case "2":
                    stopPlay();
                    break;
                case "3":
                    pausePlay();
                    break;
                case "4":
                    resumePlay();
                    break;
                case "5":
                    break;
                case "6":
                    startMenu.userInterface();
                    whileKey = false;
                    break;
            }
        }

    }

    @Override
    public String toString() {
        return super.ID + ":" + " / " + getName() + " / " + getReleaseYear() + " / " + getGenre() + " / " + getRating();
    }

    @Override
    public int compareTo(MediaData o) {
        return this.getName().compareTo((o).getName());
    }
}
