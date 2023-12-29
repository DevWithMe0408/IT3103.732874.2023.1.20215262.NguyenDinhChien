package lap_04.AimesProject;

import java.util.ArrayList;
import java.util.List;

import lap_04.AimesProject.Media.Media;

public class Store {
    private static final int MAX_IN_STORE = 10000;
    private List<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if(itemsInStore.size() == MAX_IN_STORE) {
            System.out.println("The store is full");
            return;
        }
        if(itemsInStore.contains(media)) {
            System.out.println("This media has already in store");
            return;
        }
        itemsInStore.add(media);
        System.out.println("A media has been added in store");
    }

    public void removeMedia(Media media) {
        if(itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("A media has been removed from store");
            return;
        }
        System.out.println("Can't find the media in store");
    }
    public Media findMedia(String title) {
        for(int i=0; i<itemsInStore.size();i++) {
            if(title.equals(itemsInStore.get(i).getTitle())) {
                return itemsInStore.get(i);
            }
        }
        System.out.println("Can't find the media");
        return null;


    }
}
