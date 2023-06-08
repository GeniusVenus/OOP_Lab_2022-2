package Lab04.AimsProject.src.hust.soict.globalict.aims.media.comparator;
import Lab04.AimsProject.src.hust.soict.globalict.aims.media.Media;
import java.util.*;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1 , Media m2){
        float cost1 = m1.getCost();
        float cost2 = m2.getCost();
        if(cost1 < cost2) return 1;
        else if(cost1 > cost2) return -1;
        String title1 = m1.getTitle();
        String title2 = m2.getTitle();
        if(title1.compareTo(title2) > 0) return 1;
        else if(title1.compareTo(title2) < 0) return -1;
        return 0;
    }
}
