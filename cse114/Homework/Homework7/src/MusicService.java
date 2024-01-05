// Tae Kim, 115331743, HW7
import java.util.ArrayList;
public class MusicService {
    private static ArrayList<User> userArr = new ArrayList<>();
    public static void addUser(User user) {
        userArr.add(user);
    }
    public static void removeUser(String userName) {
        for (int i = 0; i < userArr.size(); i++) {
            if (userArr.get(i).getUsername().equals(userName)) {
                userArr.remove(i);
                break;
            }
        }
    }
    public static ArrayList<Playlist> getUserPlaylists(User user) {
        return user.getPlaylistArr();
    }
}

class User {
    private String userName;
    private ArrayList<Playlist> PlaylistArr = new ArrayList<>();
    public User() {}
    public User(String userName) {
        this.userName = userName;
    }
    public String getUsername() {
        return userName;
    }
    public void addPlaylist(Playlist Playlist) {
        PlaylistArr.add(Playlist);
    }
    public void removePlaylist(String PlaylistTitle) {
        for (int i = 0; i< PlaylistArr.size(); i++) {
            if ((PlaylistArr.get(i)).getTitle().equals(PlaylistTitle)) {
                PlaylistArr.remove(i);
                break;
            }
        }
    }
    public ArrayList<Playlist> getPlaylistArr() {
        return PlaylistArr;
    }
    public Playlist getPlaylist(String PlaylistTitle) {
        for (int i = 0; i< PlaylistArr.size(); i++) {
            if ((PlaylistArr.get(i)).getTitle().equals(PlaylistTitle)) {
                return PlaylistArr.get(i);
            }
        }
        return null;
    }
    public void makeCollaborativePlaylist(String PlaylistTitle, User friend) {
        friend.PlaylistArr.add(getPlaylist(PlaylistTitle));
    }

    public String toString() {
        return userName;
    }
}