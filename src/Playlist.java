import java.util.ArrayList;

public class Playlist implements IComponent {
    private String playlistName;
    private ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        if (playlistName == null || playlistName.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la playlist no puede ser nulo o vacío.");
        }

        this.playlistName = playlistName;
        this.playlist = new ArrayList<>();
    }

    @Override
    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("La playlist '" + playlistName + "' está vacía.");
            return;
        }

        System.out.println("Reproduciento playlist: " + playlistName);
        for (IComponent component: playlist) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("La velocidad debe ser mayor que 0.");
        }

        if (playlist.isEmpty()) {
            System.out.println("La playlist '" + playlistName + "' está vacía. No hay elementos para cambiar velocidad.");
            return;
        }

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
        if (component == null) {
            throw new IllegalArgumentException("No se puede agregar un componente nulo.");
        }

        if (component == this) {
            throw new IllegalArgumentException("No se puede agregar una playlist dentro de sí misma.");
        }

        if (playlist.contains(component)) {
            System.out.println(component.getName() + " ya existe en " + playlistName);
            return;
        }

        playlist.add(component);
        System.out.println(component.getName() + " agregado a " + playlistName);
    }

    public void remove(IComponent component) {
        if (component == null) {
            throw new IllegalArgumentException("No se puede remover un componente nulo.");
        }

        if (!playlist.contains(component)) {
            System.out.println(component.getName() + " no existe en " + playlistName);
            return;
        }

        playlist.remove(component);
        System.out.println(component.getName() + " eliminado de " + playlistName);
    }

}
