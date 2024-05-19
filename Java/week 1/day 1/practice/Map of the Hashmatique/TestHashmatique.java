public class TestHashmatique {
    public static void main(String[] args){

        Hashmatique trackList = new Hashmatique();

        trackList.addSong("Diki diki", "Diki, diki, enta sadi9i");
        trackList.addSong("Alouette", "Alouette, gentille alouette ,Alouette, je te plumerai");
        trackList.addSong("Ram Sam Sam", "A ram sam sam, a ram sam sam Guli guli guli guli guli ram sam sam");
        trackList.addSong("la danse des canards", "C'est la danse des canards Qui en sortant de la mare Se secouent le bas des reins Et font coin-coin");

        String song = trackList.getSong("Diki diki");
        System.out.println("Song: " + song);
        System.out.println("*************************************************");
        trackList.getTrackList();
    }
}
