import java.util.ArrayList;

public class Playlist implements IComponent {
    private String playlistName;
    private ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("Reproduciento playlist: " + playlistName);
        for (IComponent component: playlist) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("Cambiando velocidad de playlist: " + playlistName + " a " + speed);
        for (IComponent component: playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component) {
        playlist.add(component);
        System.out.println(component.getName() + " agregado a " + playlistName);
    }

    public void remove(IComponent component) {
        playlist.remove(component);
        System.out.println(component.getName() + " eliminado de " + playlistName);
    }

}
