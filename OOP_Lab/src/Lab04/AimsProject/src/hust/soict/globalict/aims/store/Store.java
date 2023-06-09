package Lab04.AimsProject.src.hust.soict.globalict.aims.store;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.Media;

import java.util.*;
public class Store {
    private final List<Media> itemsInStore = new ArrayList<>() ;

    public Store(){

    }
    public void addMedia(Media media){
        for(Media item : itemsInStore){
            if(item.equals(media)) {
                System.out.println("Media already existed !");
                return;
            }
        }
        itemsInStore.add(media);
        System.out.println("Add media to store successfully !");
    }
    public void removeMedia(Media media){
        for(Media item : itemsInStore){
            if(item.equals(media)){
                itemsInStore.remove(media);
                System.out.println("Remove media from store successfully !");
                return;
            }
        }
        itemsInStore.remove(media);
        System.out.println("Can't find that media !");
    }
    public void removeMedia(String title){
        for(Media item : itemsInStore){
            if(item.getTitle().equals(title)){
                itemsInStore.remove(item);
                System.out.println("Remove media from store successfully !");
                return;
            }
        }
        System.out.println("Can't find that media !");
    }
    public void display(){
        System.out.println("*************** Store ***************");
        for(Media item : itemsInStore)
            System.out.println(item.toString());
    }

    public Media searchMedia(String title){
        for(Media item : itemsInStore) {
            if (item.getTitle().equals(title)) return item;
        }
        return null;
    }
}
