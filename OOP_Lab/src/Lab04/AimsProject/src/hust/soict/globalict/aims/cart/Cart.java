package Lab04.AimsProject.src.hust.soict.globalict.aims.cart;


import Lab04.AimsProject.src.hust.soict.globalict.aims.media.Media;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.comparator.MediaComparatorByCostTitle;

import java.util.*;

public class Cart {
    private final List<Media>itemsOrdered = new ArrayList<>();

    public Cart(){
    }
    public void addMedia(Media media){
        for(Media item : itemsOrdered){
            if(item.equals(media)){
                System.out.println("Media already existed !");
                return;
            }
        }
        itemsOrdered.add(media);
        System.out.println("Add media to cart successfully !");
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
