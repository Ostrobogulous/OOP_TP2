package onlinemusicplatform;

import java.util.ArrayList;
import java.util.List;

class FreeUser implements User {
    private String username;
    private List<Playlist> playlists;
    private static final int MAX_PLAYLISTS = 5;
    private static final int MAX_SONGS_PER_PLAYLIST = 20;

    public FreeUser(String username) {
        this.username = username;
        playlists = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void listen(Song song) {
        System.out.printf("User %s is playing music.\n", username);
        System.out.println("Ad playing.....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        song.playSong();
    }


    @Override
    public void removeFromPlaylist(Playlist playlist, Song song) {
        if (!playlists.contains(playlist)) {
            System.out.printf("Playlist doesn't belong to %s.", username);
            return;
        }
        playlist.removeSong(song);
    }

    @Override
    public void addToPlaylist(Playlist playlist, Song song) {
        if (!playlists.contains(playlist)) {
            System.out.printf("Playlist doesn't belong to %s.", username);
            return;
        }
        if (playlist.getSongs().size() == 20) {
            System.out.println("You can't add more than 20 songs to a playlist.");
            System.out.println("Get premium to create infinite number of songs in a playlist.");
        }
        playlist.addSong(song);
        System.out.println();
    }

    @Override
    public void shufflePlaylist(Playlist playlist) {
        if (!playlists.contains(playlist)) {
            System.out.printf("Playlist doesn't belong to %s.", username);
            return;
        }
        playlist.shufflePlaylist();
        System.out.printf("Playlist %s shuffled.\n", playlist.getName());
    }

    @Override
    public Playlist createPlaylist(String name) {
        if (playlists.size() >= 5) {
            System.out.println("You can't create more than 5 playlists.");
            System.out.println("Get premium to create infinite number of playlists.");
            return null;
        }
        Playlist playlist = new Playlist(name, this);
        playlists.add(playlist);
        System.out.printf("Playlist %s created.\n", playlist.getName());
        return playlist;
    }

    @Override
    public void removePlayList(Playlist playlist) {
        if (playlists.contains(playlist)) {
            playlists.remove(playlist);
            System.out.printf("Playlist %s is removed.\n", playlist.getName());
            System.out.println();
            playlist = null;
        } else {
            System.out.printf("Playlist %s doesn't belong to %s.\n", playlist.getName(), username);
            System.out.println();
        }

    }

    @Override
    public void playPlaylist(Playlist playlist) {
        System.out.printf("User %s is playing playlist %s.\n", username, playlist.getName());
        for (Song song : playlist.getSongs()) {
            listen(song);
        }
    }
}
