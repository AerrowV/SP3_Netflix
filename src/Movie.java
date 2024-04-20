public class Movie extends MediaData implements Media {

    public Movie(String name, String genre, int releaseYear, int rating) {
        super(name, genre, releaseYear, rating);

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
}
