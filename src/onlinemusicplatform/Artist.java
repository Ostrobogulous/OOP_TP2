package onlinemusicplatform;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        if (albums.contains(album)) {
            System.out.printf("Artist %s already has album %s.\n", name, album.getTitle());
            return;
        }
        albums.add(album);
        System.out.printf("Artist %s added album %s.\n", name, album.getTitle());
        System.out.println();
    }

    public void deleteAlbum(Album album) {
        if (albums.contains(album)) {
            albums.remove(album);
            System.out.printf("Artist %s deleted album %s.\n", name, album.getTitle());
        } else {
            System.out.printf("Artist %s has no album %s.\n", name, album.getTitle());
        }
        System.out.println();

    }

    public void listAlbums() {
        if (albums.isEmpty()) {
            System.out.println("Artist has no albums.");
            return;
        }
        System.out.printf("Artist %s albums: \n", name);
        for (Album album : albums) {
            System.out.printf("%s | %d songs\n", album.getTitle(), album.getSongsCount());
        }
        System.out.println();
    }
}
