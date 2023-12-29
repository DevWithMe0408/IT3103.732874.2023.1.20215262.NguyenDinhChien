package lap_04.AimesProject.Media;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,director,cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,director,length,cost);
    }
    public DigitalVideoDisc() {
        super();
    }
    public void play() {
        System.out.println("Playing DVD: "+ this.getTitle());
        System.out.println("DVD length: "+ this.getLength());
    }
    @Override
    public String toString() {
        return "DigitalVideoDisc: ID:" + id + " Title:" + title +", Length=" + length + ", Director:" + director + ", "
                + "Category:" + category + " Cost=" + cost;
    }
}