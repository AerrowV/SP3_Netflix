import java.util.ArrayList;
import java.util.List;

public class Season {
    NetflixMenu menu = new NetflixMenu();

    ArrayList<Episode> episodes = new ArrayList<Episode>();

    public Season(String seasonInfo) {
    }

    public void season() {
        for (int i = 0; i < menu.getSeriesList().size(); i++) {
            List<String> episodeNumber = menu.getSeriesList().get(i).getSeasonEpisode();
            for (int j = 0; j < episodeNumber.size() ; j++) {
                String[] epNum = episodeNumber.get(j).split("-");
               // episodes.add(new Episode(epNum[1]));
            }
        }
    }

}

   /* public void searchGenre(){
        NetflixMenu menu = new NetflixMenu();
        String chosenGenre = mediaWithThisGenre()
        for (int i = 0; i < menu.getMovieList().size(); i++) {

            String movieGenre = menu.getMovieList().get(i).genre;
            String[] genres = movieGenre.split(",");

            for (int j = 0; j < genres.length; j++) {
                if(genres[j].trim().equals(chosenGenre)){
                    System.out.println(menu.getMovieList().get(i));
                }
            }
        }
    */