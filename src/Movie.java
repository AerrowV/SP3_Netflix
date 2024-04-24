import java.util.ArrayList;

public class Movie extends MediaData implements Media {

    public Movie(String name, String releaseYear, String genre, float rating, int ID) {
        super(name, genre, releaseYear, rating, ID);

    }

    public void movieOptions(){
        boolean whileKey = true;
        TextUI ui = new TextUI();
        StartMenu startMenu = new StartMenu();
        User user = new User();
        ui.displayMsg("1: Play movie\n2: Stop movie\n3: Pause movie\n4: Resume\n5: Save to Watch later \n6: Back to menu");

        while (whileKey) {
            String userChoise = ui.userInput();
            switch (userChoise) {
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
                   user.writerWatchLaterAndWatchList(this.getName());
                    break;
                case "6":
                    startMenu.userInterface();
                    whileKey = false;
            }
        }
    }

    @Override
    public void resumePlay() {
        System.out.println("Resuming movie: " + getName());
    }

    @Override
    public void stopPlay() {
        System.out.println("Stopping movie: " + getName());
    }

    @Override
    public void pausePlay() {
        System.out.println("Pausing movie: " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + getName());
    }

    @Override
    public String toString() {
        return super.ID + ":" +  " / " +getName() + " / " + getReleaseYear() +  " / "  + getGenre()  + " / " + getRating();
    }

    @Override
    public int compareTo(MediaData o) {
        return this.getName().compareTo((o).getName());
    }
}

