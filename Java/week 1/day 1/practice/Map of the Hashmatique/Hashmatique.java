import java.util.HashMap;
public class Hashmatique {
    private HashMap<String, String> trackList = new HashMap<String, String>();

    public void addSong(String title, String lyrics) {
        trackList.put(title, lyrics);
    }

    public String getSong(String title) {
        return trackList.get(title);
    }
    
    public void getTrackList() {
        for (String key : trackList.keySet()) {
            System.out.println("Title : " + key + " / lyrics : " + trackList.get(key));
        }
    }
}