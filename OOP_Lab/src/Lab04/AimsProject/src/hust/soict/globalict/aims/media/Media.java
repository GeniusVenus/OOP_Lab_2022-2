package Lab04.AimsProject.src.hust.soict.globalict.aims.media;

import Lab04.AimsProject.src.hust.soict.globalict.aims.media.comparator.MediaComparatorByCostTitle;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.comparator.MediaComparatorByTitleCost;

import java.util.Comparator;

abstract public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public Media(){
    }
    public Media(int id , String title , String category , float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Media)) return false;
        Media m = (Media) o;
        return title.equals(m.getTitle());
    }
}
