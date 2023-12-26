package onlinemusicplatform;

public enum SongGenre {
    POP("Pop"),
    JAZZ("Jazz"),
    CLASSICAL("Classical"),
    ROCK("Rock"),
    HIP_HOP("Hip Hop"),
    METAL("Metal"),
    RAP("Rap"),
    UNKNOWN("Unknown");

    private final String genreString;

    SongGenre(String genreString) {
        this.genreString = genreString;
    }

    public String getGenreString() {
        return genreString;
    }
}
