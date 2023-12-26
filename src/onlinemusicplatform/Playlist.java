package onlinemusicplatform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private String name;
    private User user;
    private List<Song> songs;

    public Playlist(String name, User user) {
        this.name = name;
        this.user = user;
        this.songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }

    public void addSong(Song song) {
        if (songs.contains(song)) {
            System.out.printf("Song %s is already in playlist %s.\n", song.getTitle(), name);
            return;
        }
        songs.add(song);
        System.out.printf("Song %s added to playlist %s.\n", song.getTitle(), name);
    }

    public void removeSong(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.printf("Song %s removed from playlist %s.\n", song.getTitle(), name);
        } else {
            System.out.printf("Song %s is not in playlist %s.\n", song.getTitle(), name);
        }
    }

    public void shufflePlaylist() {
        System.out.println("Shuffling playlist");
        Collections.shuffle(songs);
        System.out.println("Playlist shuffled");
    }

}
