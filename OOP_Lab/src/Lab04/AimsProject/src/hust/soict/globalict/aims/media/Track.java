package Lab04.AimsProject.src.hust.soict.globalict.aims.media;

public class Track implements Playable{
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

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Track)) return false;
        Track m = (Track) o;
        return title == m.getTitle() && length == m.getLength();
    }
}
