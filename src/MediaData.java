 public abstract class MediaData implements Comparable<MediaData>{

    private String name;
    private String genre;
    private String releaseYear;
    private float rating;
    protected int ID;


    public MediaData(String name, String genre, String releaseYear, float rating, int ID) {
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.ID = ID;

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

     public int getID() {
         return ID;
     }


 }
