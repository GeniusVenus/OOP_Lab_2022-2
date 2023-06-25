package Lab05.AimsProject.src.hust.soict.globalict.aims.screen.controller;

import Lab05.AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import Lab05.AimsProject.src.hust.soict.globalict.aims.exception.LimitExceededException;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Media;
import Lab05.AimsProject.src.hust.soict.globalict.aims.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;


public class Controller {
    private Cart cart = new Cart();
    private Store store = new Store();
    @FXML
    private VBox layout;

    public void addMediaToStore(Media media){
        store.addMedia(media);
    }
    public int getStoreAmount(){
        return store.getItemsInStore().size();
    }
    public void addMediaToCart(Media media)  {
        try {
            cart.addMedia(media);
        }
        catch (LimitExceededException e){
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage());
            alert.showAndWait();
            e.printStackTrace();
        }
    }
    public int getCartAmount(){ return cart.getItemsOrdered().size(); }
    public void showStoreScreen(){
        StoreScreenController controller = new StoreScreenController(store);
        controller.setGrid();
        controller.add(layout);
    }
    public void showCartScreen(){
        CartScreenController controller = new CartScreenController(cart);
        controller.setTable();
        controller.add(layout);
    }
    public void showAddBookScreen(){
        AddBookToStoreController controller = new AddBookToStoreController();
        controller.add(layout);
    }
    public void showAddCDScreen(){
        AddCompactDiscToStoreController controller = new AddCompactDiscToStoreController();
        controller.add(layout);
    }
    public void showAddDVDScreen(){
        AddDigitalVideoDiscToStoreController controller = new AddDigitalVideoDiscToStoreController();
        controller.add(layout);
    }
    public void resetLayout(){
        layout.getChildren().clear();
    }
    public void moveToPage(String page){
        resetLayout();
        generatePage(page);
    }
    public void generatePage(String page){
        if(page.equalsIgnoreCase("store")) showStoreScreen();
        else if(page.equalsIgnoreCase("cart")) showCartScreen();
        else if(page.equalsIgnoreCase("add-book")) showAddBookScreen();
        else if(page.equalsIgnoreCase("add-cd")) showAddCDScreen();
        else if(page.equalsIgnoreCase("add-dvd")) showAddDVDScreen();
    }
}
