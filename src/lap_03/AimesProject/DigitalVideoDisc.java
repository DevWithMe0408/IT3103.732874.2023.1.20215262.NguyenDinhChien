package lap_03.AimesProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    // 7. Create accessors and mutators for the class DigitalVideoDisc
    //create setters and getters for private attributes
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // 8. Create Constructor method
    //	Create a DVD object by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    //	Create a DVD object by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    //	Create a DVD object by director, category, title and cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    //	Create a DVD object by all attributes: title, category, director, length and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String toString() {
        return (String.format("%-20s  %-20s  %-20s  %-20d  %-20.2f \n", getTitle(), getCategory(), getDirector(), getLength(), getCost()));
    }

    public boolean isMatch(String title) {
        String[] tmp = title.split(" ", 0);

        for (String x : tmp) {
            // convert all to LowerCase, and compare each word
            if ((getTitle().toLowerCase()).contains(x.toLowerCase())) return true;
        }

        return false;
    }

    public boolean isMatch(int id) {
        return this.id == id;
    }


}


