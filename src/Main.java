public class Main {
    public static void main(String[] args) {
        IComponent song1 = new Song("Soñé", "Zoé");
        IComponent song2 = new Song("Hey Jude", "The Beatles");
        IComponent song3 = new Song("Remember the time", "Michael Jackson");

        Playlist rockPlaylist = new Playlist("Playlist de rock");

        rockPlaylist.add(song1);
        rockPlaylist.add(song2);
        rockPlaylist.add(song3);

        rockPlaylist.play();

        System.out.println("\n--- Cambiando velocidad ---\n");

        rockPlaylist.setPlaybackSpeed(2.0f);

        System.out.println("\n--- Reproduciendo nuevamente ---\n");

        rockPlaylist.play();
    }
}