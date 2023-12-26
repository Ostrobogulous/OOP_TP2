package onlinemusicplatform;

import java.util.ArrayList;
import java.util.List;

public class PremiumUser implements User {
    String username;
    private List<Playlist> playlists;

    public PremiumUser(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void listen(Song song) {
        System.out.printf("User %s is playing music.\n", username);
        song.playSong();
        System.out.println();
    }

    @Override
    public void removeFromPlaylist(Playlist playlist, Song song) {
        if (!playlists.contains(playlist)) {
            System.out.printf("Playlist doesn't belong to %s.\n", username);
            return;
        }
        playlist.removeSong(song);
        System.out.printf("Song %s removed from playlist %s.\n", song.getTitle(), playlist.getName());
        System.out.println();
    }

    @Override
    public void addToPlaylist(Playlist playlist, Song song) {
        if (!playlists.contains(playlist)) {
            System.out.printf("Playlist doesn't belong to %s.\n", username);
            return;
        }
        playlist.addSong(song);
        System.out.println();
    }

    @Override
    public void shufflePlaylist(Playlist playlist) {
        if (!playlists.contains(playlist)) {
            System.out.printf("Playlist doesn't belong to %s.\n", username);
            return;
        }
        playlist.shufflePlaylist();
        System.out.printf("Playlist %s shuffled.\n", playlist.getName());
        System.out.println();
    }

    @Override
    public Playlist createPlaylist(String name) {
        Playlist playlist = new Playlist(name, this);
        playlists.add(playlist);
        System.out.printf("Playlist %s created.\n", playlist.getName());
        System.out.println();
        return playlist;
    }

    @Override
    public void removePlayList(Playlist playlist) {
        if (playlists.contains(playlist)) {
            playlists.remove(playlist);
            System.out.printf("Playlist %s removed.\n", playlist.getName());
            System.out.println();
        } else {
            System.out.printf("Playlist %s doesn't belong to %s.\n", playlist.getName(), username);
            System.out.println();
        }

    }

    @Override
    public void playPlaylist(Playlist playlist) {
        for (Song song : playlist.getSongs()) {
            listen(song);
        }
    }
}
