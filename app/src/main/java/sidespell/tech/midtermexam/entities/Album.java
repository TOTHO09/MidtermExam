package sidespell.tech.midtermexam.entities;

import android.graphics.Bitmap;

/**
 * Created by Martino on 2016-02-02.
 */
public class Album {
    private Bitmap albumPhoto;
    private String albumArtist;
    private String albumName;

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public Bitmap getAlbumPhoto() {
        return albumPhoto;
    }

    public void setAlbumPhoto(Bitmap albumPhoto) {
        this.albumPhoto = albumPhoto;
    }
}
