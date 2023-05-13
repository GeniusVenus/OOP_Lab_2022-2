package Lab03.AimsProject.src.hust.soict.globalict.aims.store;
import Lab03.AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;

import java.util.*;
public class Store {
    private final List<DigitalVideoDisc> itemsInStore = new ArrayList<>() ;

    public Store(){

    }
    public void addDVD(DigitalVideoDisc dvd1){
        itemsInStore.add(dvd1);
    }
    public void removeDVD(DigitalVideoDisc dvd1){
        itemsInStore.remove(dvd1);
    }
    public void print(){
        System.out.println(itemsInStore.size() + " DVDs in the store ");
        for(int i = 0 ; i < itemsInStore.size() ; i++){
            String result = ". DVD - ";
            if(itemsInStore.get(i).getTitle() != null) result += itemsInStore.get(i).getTitle() ;
            if(itemsInStore.get(i).getCategory() != null) result += " - " + itemsInStore.get(i).getCategory();
            if(itemsInStore.get(i).getDirector() != null) result += " - " + itemsInStore.get(i).getDirector();
            if(itemsInStore.get(i).getLength() != 0) result += " - " + itemsInStore.get(i).getLength();
            if(itemsInStore.get(i).getCost() != 0) result += ": "+ itemsInStore.get(i).getCost();
            System.out.println(result);
        }
    }
}
