package Lab05.AimsProject.src.hust.soict.globalict.aims.cart;


import Lab05.AimsProject.src.hust.soict.globalict.aims.exception.LimitExceededException;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Media;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Playable;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.comparator.MediaComparatorByCostTitle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.util.*;

public class Cart {
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public static int MAX_NUMBER_ORDERED = 20;

    public Cart(){
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media media) throws LimitExceededException {
        if(itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            for (Media item : itemsOrdered) {
                if (item.equals(media)) {
                    Alert alert = new Alert(Alert.AlertType.WARNING, "Media already existed in cart");
                    alert.showAndWait();
                    return;
                }
            }
            itemsOrdered.add(media);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Add media to cart succesfully");
            alert.showAndWait();
        }
        else {
            throw new LimitExceededException("ERROR: The cart is almost full");
        }

    }
    public void removeMedia(Media media){
        for(Media item : itemsOrdered){
            if(item.equals(media)){
                itemsOrdered.remove(media);
                System.out.println("Remove media from cart successfully !");
                return;
            }
        }
        itemsOrdered.remove(media);
        System.out.println("Can't find that media !");
    }
    public void removeMedia(String title){
        for(Media item : itemsOrdered){
            if(item.getTitle().equals(title)){
                itemsOrdered.remove(item);
                System.out.println("Remove media from cart successfully !");
                return;
            }
        }
        System.out.println("Can't find that media !");
    }
    public float totalCost(){
        float total = 0;
        for(Media item : itemsOrdered) total += item.getCost();
        return total;
    }

    public void display(){
        System.out.println("*************** Cart ***************");
        for(Media item : itemsOrdered){
            System.out.println(item.toString());
        }
    }
    public int size(){
        return itemsOrdered.size();
    }
    public void clearCart(){
        itemsOrdered.clear();
    }
    public void sortByTitle(){
        Collections.sort(itemsOrdered , Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCost(){
        Collections.sort(itemsOrdered , Media.COMPARE_BY_COST_TITLE);
    }
    public Media searchMedia(String title){
        for(Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) return item;
        }
        return null;
    }
    public Media searchMedia(int id){
        for(Media item : itemsOrdered) {
            if (item.getId() == id) return item;
        }
        return null;
    }
}
