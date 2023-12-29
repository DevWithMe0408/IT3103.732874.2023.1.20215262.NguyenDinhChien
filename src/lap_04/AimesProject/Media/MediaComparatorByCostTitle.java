package lap_04.AimesProject.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    Comparator<Media> compareByTitle = Comparator.comparing(Media::getCost)
            .thenComparing(Media::getTitle);

    @Override
    public int compare(Media o1, Media o2) {
        return (compareByTitle.compare(o1,o2));
    }

}
