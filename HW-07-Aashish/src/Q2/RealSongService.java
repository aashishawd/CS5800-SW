package Q2;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songs;

    public RealSongService() {
        // Initialize songs
        songs = new ArrayList<>();
        songs.add(new Song(1, "Labon Ko", "K K", "Bhool Bhulaiyaa", 341));
        songs.add(new Song(2, "Until I Found You", "Stephen Sanchez", "Until I Found You", 178));
        songs.add(new Song(3, "Paper Cut", "Linkin Park", "Album 1", 220));
        songs.add(new Song(4, "Bekhayali", "Sachet Tandon", "Kabir Singh", 190));
        songs.add(new Song(5, "Kohinoor", "Sachet Tandon", "Album 1", 210));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Song song : songs) {
            if (song.getSongID().equals(songID)) {
                return song;
            }
        }
        return null; // Return null if songID is not found
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }
}
