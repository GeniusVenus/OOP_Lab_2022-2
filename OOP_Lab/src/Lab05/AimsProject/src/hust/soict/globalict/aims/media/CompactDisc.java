package Lab05.AimsProject.src.hust.soict.globalict.aims.media;

import Lab05.AimsProject.src.hust.soict.globalict.aims.exception.PlayerException;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Disc;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Playable;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Track;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private final List<Track>tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public CompactDisc(){

    }
    public CompactDisc(int id , String title , String category , float cost , String director , int length , String artist ){
        super(id , title , category , cost , director , length);
        this.artist = artist;
    }
    public void addTrack(Track track){
        for(Track t : tracks){
            if(t.equals(track)) {
                System.out.println("Track already existed !");
                return ;
            }
        }
        tracks.add(track);
    }
    public void removeTrack(Track track){
        for(Track t : tracks) {
            if (t.equals(track)) {
                tracks.remove(track);
                return ;
            }
        }
        System.out.println("Can't find track");
    }
    public int getLength(){
        int total = 0;
        for(Track track : tracks) total += track.getLength();
        return total;
    }
    public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD length: " + this.getLength());

            StringBuffer info = new StringBuffer("");
            info.append("Playing CD: " + this.getTitle() + "\n" + "CD length: " + this.getLength() + "\n");

            for (Track t : tracks) {
                try {
                    StringBuffer trackInfo = t.play();
                    info.append(trackInfo + "\n");
                } catch (PlayerException e) {
                    throw e;
                }
            }
            return info;
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }

    }
    public String toString(){
        StringBuffer printDisc = new StringBuffer();
        printDisc.append(getId());
        printDisc.append(" - ");
        printDisc.append("CD");
        printDisc.append(" - ");
        printDisc.append(getTitle());
        printDisc.append(" - ");
        printDisc.append(getCategory());
        printDisc.append(" - ");
        printDisc.append(getDirector());
        printDisc.append(" - ");
        printDisc.append(getLength());
        printDisc.append(" - ");
        printDisc.append(getArtist());
        printDisc.append(": ");
        printDisc.append(getCost());
        return  printDisc.toString();
    }
}
