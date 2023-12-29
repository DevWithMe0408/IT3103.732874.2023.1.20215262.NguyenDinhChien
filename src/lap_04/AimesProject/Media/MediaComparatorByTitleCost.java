package lap_04.AimesProject.Media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
    Comparator<Media> compareByTitle = Comparator.comparing(Media::getTitle)
            .thenComparing(Media::getCost);

    @Override
    public int compare(Media o1, Media o2) {
        return (compareByTitle.compare(o1,o2));
    }
}
