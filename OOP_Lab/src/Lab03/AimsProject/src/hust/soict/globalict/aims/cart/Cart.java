package Lab03.AimsProject.src.hust.soict.globalict.aims.cart;


import Lab03.AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    private int qtyOrdered;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public Cart(){
        this.qtyOrdered = 0;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            return;
        }
        System.out.println("The cart is almost full");
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(int i = 0 ; i < dvdList.length ; i++)
            addDigitalVideoDisc(dvdList[i]);
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    public float totalCost(){
        float total = 0 ;
        for(int i = 0 ; i < qtyOrdered ; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int DeletePos = -1;
        for(int i = 0 ; i < qtyOrdered ; i++) {
            if (disc.getTitle().equals(itemsOrdered[i].getTitle())){
                DeletePos = i;
                break;
            }
        }
        DigitalVideoDisc[] temp = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        temp = itemsOrdered;
        if(DeletePos == -1) return;
        int k = 0;
        for(int i = 0 ; i < qtyOrdered ; i++) {
            if (i != DeletePos) {
                itemsOrdered[k] = temp[i];
                k++;
            }
        }
        qtyOrdered--;
        System.out.println("The disc has been removed");
    }
    public void print(){
        System.out.println("***********************CART***********************");
        for(int i = 0 ; i < qtyOrdered ; i++){
            String result = ". DVD - ";
            if(itemsOrdered[i].getTitle() != null) result += itemsOrdered[i].getTitle() ;
            if(itemsOrdered[i].getCategory() != null) result += " - " + itemsOrdered[i].getCategory();
            if(itemsOrdered[i].getDirector() != null) result += " - " + itemsOrdered[i].getDirector();
            if(itemsOrdered[i].getLength() != 0) result += " - " + itemsOrdered[i].getLength();
            if(itemsOrdered[i].getCost() != 0) result += ": "+ itemsOrdered[i].getCost();
            System.out.println(result);
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***************************************************");
    }
    public void SearchForId(int id){
        for(int i = 0 ; i < qtyOrdered ; i++){
            if(itemsOrdered[i].isMatch(id)){
                String result = (i+1) + ". DVD - ";
                if(itemsOrdered[i].getTitle() != null) result += itemsOrdered[i].getTitle() ;
                if(itemsOrdered[i].getCategory() != null) result += " - " + itemsOrdered[i].getCategory();
                if(itemsOrdered[i].getDirector() != null) result += " - " + itemsOrdered[i].getDirector();
                if(itemsOrdered[i].getLength() != 0) result += " - " + itemsOrdered[i].getLength();
                if(itemsOrdered[i].getCost() != 0) result += ": "+ itemsOrdered[i].getCost();
                System.out.println(result);
                return;
            }
        }
        System.out.println("No result!");
    }
    public void SearchForTitle(String title){
        for(int i = 0 ; i < qtyOrdered ; i++){
            if(itemsOrdered[i].isMatch(title)){
                String result = (i+1) + ". DVD - ";
                if(itemsOrdered[i].getTitle() != null) result += itemsOrdered[i].getTitle() ;
                if(itemsOrdered[i].getCategory() != null) result += " - " + itemsOrdered[i].getCategory();
                if(itemsOrdered[i].getDirector() != null) result += " - " + itemsOrdered[i].getDirector();
                if(itemsOrdered[i].getLength() != 0) result += " - " + itemsOrdered[i].getLength();
                if(itemsOrdered[i].getCost() != 0) result += ": "+ itemsOrdered[i].getCost();
                System.out.println(result);
                return;
            }
        }
        System.out.println("No result!");
    }
}
