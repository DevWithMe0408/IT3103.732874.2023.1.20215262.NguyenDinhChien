package lap_04.AimesProject.Media;

public class Disc extends Media {

    protected int length;
    protected String director;
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public Disc() {
        super();
    }
    public Disc(String title) {
        super(title);
        this.title = title;
    }
    public Disc(String title, String category, float cost) {
        super(title,category,cost);
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Disc(String title, String category) {
        super(title,category);
        this.title = title;
        this.category = category;
    }
    public Disc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public Disc(String title, String category, String director, float cost) {
        super(title,category,cost);
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setDirector(String director) {
        this.director = director;
    }
}