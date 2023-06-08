package Lab04.AimsProject.src.hust.soict.globalict.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private final List<Track>tracks = new ArrayList<Track>();

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
    public void play(){
        for(Track track : tracks)
            track.play();

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
