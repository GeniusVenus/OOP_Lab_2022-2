package Lab05.AimsProject.src.hust.soict.globalict.aims.media;

import Lab05.AimsProject.src.hust.soict.globalict.aims.media.comparator.MediaComparatorByCostTitle;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.comparator.MediaComparatorByTitleCost;

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
        try {
            return ((Media)o).getTitle().equals(this.title);
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e1) {
            return false;
        }
    }
    public boolean filterProperty(String filter, String filterType) {
        if (filter == null || filter.isEmpty()) return true;

        if (filterType.equals("title")) {
            if (this.getTitle().toLowerCase().indexOf(filter.toLowerCase()) != -1) return true;
        }
        else if (filterType.equals("id")) {
            if (Integer.toString(this.getId()).toLowerCase().indexOf(filter.toLowerCase()) != -1) return true;
        }
        return false;
    }
}
