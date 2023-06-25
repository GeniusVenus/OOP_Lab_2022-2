package Lab05.AimsProject.src.hust.soict.globalict.aims.media;

import Lab05.AimsProject.src.hust.soict.globalict.aims.exception.PlayerException;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Playable;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(){

    }
    public Track(String title , int length){
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());

            StringBuffer info = new StringBuffer("");
            info.append("Playing track: " + this.getTitle() + "\n" + "Track length: " + this.getLength());
            return info;
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    }
    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Track)) return false;
        Track m = (Track) o;
        return title == m.getTitle() && length == m.getLength();
    }
}
