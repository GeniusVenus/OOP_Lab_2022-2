package Lab05.AimsProject.src.hust.soict.globalict.aims.media;

import Lab05.AimsProject.src.hust.soict.globalict.aims.exception.PlayerException;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Media;

public class Disc extends Media {
    private String director;
    private int length;
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public Disc(){

    }
    public Disc(int id , String title , String category , float cost , String director , int length){
        super(id , title , category , cost);
        setDirector(director);
        setLength(length);
    }
}
