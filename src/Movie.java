public class Movie extends MediaData implements Media {

    public Movie(String name, String releaseYear, String genre, float rating, int ID) {
        super(name, genre, releaseYear, rating, ID);

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

