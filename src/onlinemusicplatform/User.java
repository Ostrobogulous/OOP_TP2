package onlinemusicplatform;

public interface User {
    String getUsername();

    void listen(Song song);

    void addToPlaylist(Playlist playlist, Song song);

    void removeFromPlaylist(Playlist playlist, Song song);

    void shufflePlaylist(Playlist playlist);

    Playlist createPlaylist(String name);

    void removePlayList(Playlist playlist);

    void playPlaylist(Playlist playlist);
}
