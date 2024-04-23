 public abstract class MediaData implements Comparable<MediaData>{

    String name;
    String genre;
    String releaseYear;
    float rating;


    public MediaData(String name, String genre, String releaseYear, float rating) {
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

    public String getReleaseYear() {
        return releaseYear;
    }

    public float getRating() {
        return rating;
    }

}
