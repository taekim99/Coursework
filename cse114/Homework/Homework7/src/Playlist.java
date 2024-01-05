// Tae Kim, 115331743, HW7
import java.util.Collections;
import java.util.ArrayList;
public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songArr = new ArrayList<>();
    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }
    public String getTitle() {
        return playlistTitle;
    }
    public void setTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }
    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }
    public void addSong(Song song) {
        songArr.add(song);
    }
    public void removeSong(String songName) {
        for (int i = 0; i< songArr.size(); i++) {
            if ((songArr.get(i)).getSongName().equals(songName)) {
                songArr.remove(i);
                break;
            }
        }
    }
    public void swapSongs(Song song1, Song song2) {
        int indexSong1 = -1;
        int indexSong2 = -1;

        for (int i = 0; i < songArr.size(); i++) {
            if (songArr.get(i).equals(song1)) {
                indexSong1 = i;
            }
        }
        for (int i = 0; i < songArr.size(); i++) {
            if (songArr.get(i).equals(song2)) {
                indexSong2 = i;
            }
        }

        if (indexSong1 != -1 && indexSong2 != -1) {
            Song temp = songArr.get(indexSong1);
            songArr.set(indexSong1, songArr.get(indexSong2));
            songArr.set(indexSong2, temp);
        }
    }
    public void sortSongs() {
        Collections.sort(songArr);
    }

    public String totalTime() {
        int totalMinutes = 0;
        int totalSeconds = 0;
        for (int i = 0; i < songArr.size(); i++) {
            totalMinutes += Integer.parseInt(songArr.get(i).getDuration().substring(0, 1));
            totalSeconds += Integer.parseInt(songArr.get(i).getDuration().substring(2));
        }

        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;
        return totalMinutes + "min, " + totalSeconds + "sec";
    }
    public String toString() {
        String output = playlistTitle +  " - " + totalTime() + "\n";

        for (int i = 0; i < songArr.size(); i++) {
            output += (i+1) + " "+ songArr.get(i).toString() + "\n";
        }

        return output;
    }
}
