package Lab05.AimsProject.src.hust.soict.globalict.aims.store;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Media;
import javafx.scene.control.Alert;

import java.util.*;
public class Store {
    private final List<Media> itemsInStore = new ArrayList<>() ;

    public Store(){

    }

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media media){
        for(Media item : itemsInStore){
            if(item.equals(media)) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Media already existed in store");
                alert.showAndWait();
                return;
            }
        }
        itemsInStore.add(media);
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Add media to store succesfully");
        alert.showAndWait();
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
