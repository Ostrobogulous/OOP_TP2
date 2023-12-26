package onlinemusicplatform;

public class Runner {
    public static void main(String[] args) {
        Song song1 = new Song("Anti-Hero", 5 * 60 + 10, "pop");
        Song song2 = new Song("Sharks", 3 * 60 + 37, "pop");
        Song song3 = new Song("Bones", 2 * 60 + 46, "rock");
        Album album1 = new Album("Mercury");
        album1.addSong(song2);
        album1.addSong(song3);
        album1.addSong(song3);
        Artist artist1 = new Artist("Imagine Dragons");
        artist1.addAlbum(album1);
        FreeUser user1 = new FreeUser("Iyed");
        user1.listen(song1);
        PremiumUser user2 = new PremiumUser("Melek");
        user2.listen(song2);
        Playlist playlist1 = user1.createPlaylist("FTW");
        user1.addToPlaylist(playlist1, song1);
        user1.addToPlaylist(playlist1, song1);
        user2.addToPlaylist(playlist1, song2);
        user1.addToPlaylist(playlist1, song2);
        user1.addToPlaylist(playlist1, song3);
        user1.playPlaylist(playlist1);
        user1.shufflePlaylist(playlist1);
        user1.playPlaylist(playlist1);
        user1.removeFromPlaylist(playlist1, song1);
        user1.removeFromPlaylist(playlist1, song1);
        user2.removePlayList(playlist1);
        user1.removePlayList(playlist1);
    }
}
