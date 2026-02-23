public class Song implements IComponent {
    private String songName;
    private String artist;
    private float speed;

    public Song(String songName, String artist) {
        if (songName == null || songName.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la canción no puede ser nulo o vacío.");
        }

        if (artist == null || artist.trim().isEmpty()) {
            throw new IllegalArgumentException("El artista no puede ser nulo o vacío.");
        }

        this.songName = songName;
        this.artist = artist;
        this.speed = 1.0f;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo canción: " + songName + ", Artista: " + artist + ", Velocidad: " + speed);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("La velocidad debe ser mayor que 0.");
        }

        this.speed = speed;
        System.out.println("Velocidad de '" + songName + "' cambiada a: " + speed);

    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }

}
