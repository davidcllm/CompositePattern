public class Main {
    public static void main(String[] args) {
        IComponent song1 = new Song("Soñé", "Zoé");
        IComponent song2 = new Song("Hey Jude", "The Beatles");
        IComponent song3 = new Song("Remember the time", "Michael Jackson");

        Playlist rockPlaylist = new Playlist("Playlist de rock");
        Playlist favorites = new Playlist("Favoritas");

        rockPlaylist.add(song1);
        rockPlaylist.add(song2);

        favorites.add(rockPlaylist); //Composite
        favorites.add(song3);

        favorites.play();

        System.out.println("\n--- Cambiando velocidad ---\n");

        favorites.setPlaybackSpeed(1.5f);

        System.out.println("\n--- Reproduciendo nuevamente ---\n");

        favorites.play();
    }
}