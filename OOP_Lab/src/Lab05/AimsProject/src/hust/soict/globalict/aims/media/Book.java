package Lab05.AimsProject.src.hust.soict.globalict.aims.media;

import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Media;

import java.util.*;

public class Book extends Media {
    private List<String>authors = new ArrayList<String>();

    public Book(){

    }
    public Book(int id , String title , String category , float cost ) {
        super(id , title , category , cost);
    }

    public void addAuthor(String author){
        for(String x : authors){
            if(x.equals(author)) return;
        }
        authors.add(author);
    }
    public void removeAuthor(String author){
        int check = 0;
        for(String x : authors){
            if(x.equals(author)) {
               check = 1;
               break;
            }
        }
        if(check != 0) authors.remove(author);
    }
    public String toString(){
        StringBuffer printBook = new StringBuffer();
        printBook.append(getId());
        printBook.append(" - ");
        printBook.append("Book");
        printBook.append(" - ");
        printBook.append(getTitle());
        printBook.append(" - ");
        printBook.append(getCategory());
        printBook.append(": ");
        printBook.append(getCost());
        return printBook.toString();
    }
}
