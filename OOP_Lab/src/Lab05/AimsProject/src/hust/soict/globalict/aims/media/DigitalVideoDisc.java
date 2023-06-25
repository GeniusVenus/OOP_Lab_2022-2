package Lab05.AimsProject.src.hust.soict.globalict.aims.media;

import Lab05.AimsProject.src.hust.soict.globalict.aims.exception.PlayerException;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Disc;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Playable;

import java.util.List;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(){}
    public DigitalVideoDisc(String title){
        super();
        setTitle(title);
    }
    public DigitalVideoDisc(String title , String category , float cost ){
        super();
        setTitle(title);
        setCategory(category);
        setCost(cost);
    }
    public DigitalVideoDisc(String title, String category , String director , float cost ){
        super();
        setTitle(title);
        setCategory(category);
        setCost(cost);
        setDirector(director);
    }
    public DigitalVideoDisc(String title , String category , String director , int length , float cost) {
        setTitle(title);
        setCategory(category);
        setCost(cost);
        setDirector(director);
        setLength(length);
    }
    public DigitalVideoDisc(int id , String title , String category , float cost , String director , int length ){
        super(id , title , category , cost , director , length);
    }
    public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
            StringBuffer info = new StringBuffer("");
            info.append("Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength());
            return info;
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }

    }

    public String toString(){
        StringBuffer printDisc = new StringBuffer();
        printDisc.append(getId());
        printDisc.append(" - ");
        printDisc.append("DVD");
        printDisc.append(" - ");
        printDisc.append(getTitle());
        printDisc.append(" - ");
        printDisc.append(getCategory());
        printDisc.append(" - ");
        printDisc.append(getDirector());
        printDisc.append(" - ");
        printDisc.append(getLength());
        printDisc.append(": ");
        printDisc.append(getCost());
        return  printDisc.toString();
    }
}
