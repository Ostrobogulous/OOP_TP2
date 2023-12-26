package onlinemusicplatform;

public class Song {
    private String title;
    private int length;
    private SongGenre genre;

    public static SongGenre findGenre(String genre) {
        for (SongGenre songGenre : SongGenre.values()) {
            if (songGenre.getGenreString().equalsIgnoreCase(genre)) {
                return songGenre;
            }
        }
        return SongGenre.UNKNOWN;
    }

    public Song(String title, int length, String genre) {
        this.title = title;
        this.length = length;
        this.genre = findGenre(genre);
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre.getGenreString();
    }

    public void playSong() {
        System.out.println("Playing: " + title);
        System.out.printf("Song Length: %d:%02d\n", getLength() / 60, getLength() % 60);
        System.out.println("🎶🎶🎶🎶🎶🎶");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Song finished playing.");
        System.out.println();
    }

    public void displayInformation() {
        System.out.printf("Song title: %s | Genre: %s | Length: %d:%02d\n", title, getGenre(), getLength() / 60, getLength() % 60);
        System.out.println();
    }
}
