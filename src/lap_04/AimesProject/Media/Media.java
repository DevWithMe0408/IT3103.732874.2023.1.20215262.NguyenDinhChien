package lap_04.AimesProject.Media;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    int nbMedia=0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST =
            new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE =
            new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {
        nbMedia++;
        this.id = nbMedia;
    }
    public Media(String title,String category) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
    }
    public Media(String title) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Media) {
            Media mda = (Media) obj;
            return this.title.equals(mda.title);
        }
        return false;
    }
}
