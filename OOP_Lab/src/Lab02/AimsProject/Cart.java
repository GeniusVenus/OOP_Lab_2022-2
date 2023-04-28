package Lab02.AimsProject;
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
}
