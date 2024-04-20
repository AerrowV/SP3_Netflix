public abstract class MediaData {

    String name;
    String genre;
    int releaseYear;
    int rating;


    public MediaData(String name, String genre, int releaseYear, int rating) {
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRating() {
        return rating;
    }

}
