// Tae Kim, 115331743, HW7
public class Song implements Comparable<Song>{
    private String songName;
    private String artistName;
    private String duration;
    public Song() {}
    public Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }
    public String getSongName() {
        return songName;
    }
    public String getArtistName() {
        return artistName;
    }
    public String getDuration() {
        return duration;
    }
    @Override
    public int compareTo(Song otherSong) {
        int compare = songName.compareTo(otherSong.songName);
        if (compare == 0) {
            compare = artistName.compareTo(otherSong.artistName);
        }
        return compare;
    }
    public String toString() {
        return songName + " by " + artistName + " (" + duration + ")";
    }
}