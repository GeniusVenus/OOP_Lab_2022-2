package Lab03.AimsProject.src.hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private static int nbDigitalVideoDiscs = 0;
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(){}
    public DigitalVideoDisc(String title){
        super();
        setTitle(title);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title , String category , float cost ){
        super();
        setTitle(title);
        setCategory(category);
        setCost(cost);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category , String director , float cost ){
        super();
        setTitle(title);
        setCategory(category);
        setCost(cost);
        setDirector(director);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title , String category , String director , int length , float cost) {
        setTitle(title);
        setCategory(category);
        setCost(cost);
        setDirector(director);
        setLength(length);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public boolean isMatch(String title){
        if(this.getTitle().equals(title)) return true;
        return false;
    }
    public boolean isMatch(int ID){
        if(this.getId() == ID) return true;
        return false;
    }
}
