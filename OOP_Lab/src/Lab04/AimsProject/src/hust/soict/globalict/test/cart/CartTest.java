package Lab04.AimsProject.src.hust.soict.globalict.test.cart;

import Lab03.AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import Lab03.AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args){
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger Aller" , 87 , 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars" , "Science Fiction" , "George Lucas" , 87 , 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        cart.print();
        cart.SearchForId(1);
        cart.SearchForId(4);
        cart.SearchForTitle("Aladin");
        cart.SearchForTitle("Hello World");
    }
}
