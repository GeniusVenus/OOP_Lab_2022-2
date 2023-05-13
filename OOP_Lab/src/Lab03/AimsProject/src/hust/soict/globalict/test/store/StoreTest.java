package Lab03.AimsProject.src.hust.soict.globalict.test.store;

import Lab03.AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;
import Lab03.AimsProject.src.hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger Aller" , 87 , 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars" , "Science Fiction" , "George Lucas" , 87 , 24.95f);
        store.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation", 18.99f);
        store.addDVD(dvd3);
        store.print();
        store.removeDVD(dvd1);
        store.print();
        store.removeDVD(dvd2);
        store.print();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hello World" , "Animation", 18.99f);
        store.removeDVD(dvd4);
        store.print();
    }
}
