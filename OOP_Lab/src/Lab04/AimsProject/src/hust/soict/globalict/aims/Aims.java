package Lab04.AimsProject.src.hust.soict.globalict.aims;

import Lab04.AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.Book;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.CompactDisc;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.Media;
import Lab04.AimsProject.src.hust.soict.globalict.aims.store.Store;

import java.util.*;

public class Aims {
    public static final Scanner sc = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void main(String[] args){
        Store store = new Store();
        Cart cart = new Cart();
        int page = 1 , prev_page = 1 , option , num_med = 0;
        Media current_media = null;
        while(page != 0){
            if(page == 1){
                showMenu();
                option = sc.nextInt();
                switch(option){
                    case 0:
                        page = 0;
                        break;
                    case 1:
                        page = 2;
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("Remove or add ? ");
                        String choice = sc.nextLine();
                        choice = choice.toLowerCase();
                        if(choice.equals("remove")){
                            System.out.println("Which one you want to remove ?");
                            String title = sc.nextLine();
                            store.removeMedia(title);
                        }
                        else if(choice.equals("add")){
                            System.out.println("Which one you want to add : CD or DVD or BOOK ?");
                            String desire = sc.nextLine();
                            desire = desire.toUpperCase();
                            if(desire.equals("CD")){
                                System.out.print("Enter title : ");
                                String title = sc.nextLine();
                                System.out.print("Enter category : ");
                                String category = sc.nextLine();
                                System.out.print("Enter cost : ");
                                float cost = sc.nextFloat();
                                sc.nextLine();
                                System.out.print("Enter director : ");
                                String director = sc.nextLine();
                                System.out.print("Enter length : ");
                                int length = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter artist : ");
                                String artist = sc.nextLine();
                                num_med++;
                                CompactDisc CD = new CompactDisc(num_med , title , category , cost , director , length , artist );
                                store.addMedia(CD);
                            }
                            else if(desire.equals("DVD")){
                                System.out.print("Enter title : ");
                                String title = sc.nextLine();
                                System.out.print("Enter category : ");
                                String category = sc.nextLine();
                                System.out.print("Enter cost : ");
                                float cost = sc.nextFloat();
                                sc.nextLine();
                                System.out.print("Enter director : ");
                                String director = sc.nextLine();
                                System.out.print("Enter length : ");
                                int length = sc.nextInt();
                                num_med++;
                                DigitalVideoDisc DVD = new DigitalVideoDisc(num_med , title , category , cost , director , length );
                                store.addMedia(DVD);
                            }
                            else if(desire.equals("BOOK")){
                                System.out.print("Enter title : ");
                                String title = sc.nextLine();
                                System.out.print("Enter category : ");
                                String category = sc.nextLine();
                                System.out.print("Enter cost : ");
                                float cost = sc.nextFloat();
                                sc.nextLine();
                                num_med++;
                                Book book = new Book(num_med , title , category , cost);
                                store.addMedia(book);
                            }
                            else System.out.println("Can't find your desire :) !");

                        }
                        else System.out.println("Unknown option");
                        break;
                    case 3:
                        page = 4;
                        prev_page = 1;
                        break;
                }
            }
            if(page == 2){
                store.display();
                storeMenu();
                option = sc.nextInt();
                switch(option){
                    case 0:
                        page = 1;
                        break;
                    case 1:
                        sc.nextLine();
                        System.out.print("Enter the title of the media you want to see : ");
                        String title = sc.nextLine();
                        Media media = store.searchMedia(title);
                        if(media == null){
                            System.out.println("Media doesn't exist");
                            break;
                        }
                        current_media = media;
                        page = 3;
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Enter the title of the media you want to add : ");
                        String tit = sc.nextLine();
                        Media med = store.searchMedia(tit);
                        if(med == null ){
                            System.out.println("Media doesn't exist");
                            break;
                        }
                        cart.addMedia(med);
                        System.out.println("The number of Discs in the current cart :" + cart.size());
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.print("Enter the title of the media you want to play : ");
                        String titl = sc.nextLine();
                        Media medi = store.searchMedia(titl);
                        if(medi == null){
                            System.out.println("Media doesn't exist");
                            break;
                        }
                        if (medi instanceof DigitalVideoDisc) ((DigitalVideoDisc) medi).play();
                        else if(medi instanceof CompactDisc)((CompactDisc) medi).play();
                        else System.out.println("This is not a disc");
                        break;
                    case 4:
                        page = 4;
                        prev_page = 2;
                        break;
                }
            }
            if(page == 3){
                System.out.println(current_media.toString());
                mediaDetailsMenu();
                option = sc.nextInt();
                switch(option){
                    case 0:
                        page = 2;
                        break;
                    case 1:
                        cart.addMedia(current_media);
                        System.out.println("The number of Discs in the current cart :" + cart.size());
                        break;
                    case 2:
                        if (current_media instanceof DigitalVideoDisc) ((DigitalVideoDisc) current_media).play();
                        else if(current_media instanceof CompactDisc)((CompactDisc) current_media).play();
                        else System.out.println("This is not a disc");
                        break;
                }
            }
            if(page == 4){
                cart.display();
                cartMenu();
                option = sc.nextInt();
                switch (option){
                    case 0:
                        page = prev_page;
                        break;
                    case 1:
                        sc.nextLine();
                        System.out.print("How do you want your cart to be filtered ? ");
                        String opt = sc.nextLine();
                        opt = opt.toLowerCase();
                        Media media = null;
                        if(opt.equals("by id")){
                            int id = sc.nextInt();
                            System.out.print("Enter the id of the media : ");
                            media = cart.searchMedia(id);
                        }
                        else if(opt.equals("by title")){
                            String title = sc.nextLine();
                            System.out.print("Enter the title of the media : ");
                            media = cart.searchMedia(title);
                        }
                        else {
                            System.out.println("Don't understand your request !");
                            break;
                        }
                        if(media == null) System.out.println("Media not found !");
                        else System.out.println("Product found : " + media.toString());
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("How do you want your cart to be sorted ? ");
                        String choice = sc.nextLine();
                        if(choice.equals("by title")) cart.sortByTitle();
                        else if(choice.equals("by cost")) cart.sortByCost();
                        else System.out.println("Don't understand your request !");
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("Which one you want to remove ?");
                        String title = sc.nextLine();
                        cart.removeMedia(title);
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.print("Enter the title of the media you want to play : ");
                        String titl = sc.nextLine();
                        Media medi = cart.searchMedia(titl);
                        if(medi == null){
                            System.out.println("Media doesn't exist");
                            break;
                        }
                        if (medi instanceof DigitalVideoDisc) ((DigitalVideoDisc) medi).play();
                        else if(medi instanceof CompactDisc)((CompactDisc) medi).play();
                        else System.out.println("This is not a disc");
                        break;
                    case 5:
                        System.out.println("An order is created !");
                        cart.clearCart();
                        break;
                }
            }
        }
    }

}
