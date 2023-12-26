package onlinemusicplatform;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {
    private String title;
    private List<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getSongsCount() {
        return songs.size();
    }

    public void addSong(Song song) {
        if (songs.contains(song)) {
            System.out.printf("Song %s is already in album %s.\n", song.getTitle(), title);
            return;
        }
        songs.add(song);
        System.out.printf("Song %s added to album %s.\n", song.getTitle(), title);
    }

    public void removeSong(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.printf("Song %s removed from album %s.\n", song.getTitle(), title);
        } else {
            System.out.printf("Song %s is no in album %s.\n", song.getTitle(), title);
        }
    }

    public void removeSong(String title) {
        for (Song song : songs) {
            if (Objects.equals(song.getTitle(), title)) {
                songs.remove(song);
                System.out.printf("Song %s removed from album %s.\n", title, this.title);
                return;
            }
        }
    }

    public void listSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the albums.");
            return;
        }
        System.out.printf("Album %s songs: \n", title);
        for (Song song : songs) {
            song.displayInformation();
        }
    }
}
