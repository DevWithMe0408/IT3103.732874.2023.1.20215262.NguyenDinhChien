package lap_04.AimesProject;

import java.util.ArrayList;
import java.util.Collections;

import lap_04.AimesProject.Media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if(itemsOrdered.contains(media)) {
            System.out.println("the media has already in the cart");
            return;
        }
        itemsOrdered.add(media);
    }
    public void removeMedia(Media media) {
        if(itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("A media has been removed from cart");
            return;
        }
        System.out.println("Can't find the media in cart");
    }
    float totalCost() {
        float total = 0;
        for(int i=0;i<itemsOrdered.size();i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }
    //	public void printOrder() {
//		System.out.println( "**************CART**************");
//		System.out.println("Ordered Items: ");
//		for(int i=0;i<itemsOrdered.size();i++) {
//			System.out.println(i+". "+itemsOrdered.get(i).getTitle()+
//					"-"+itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getDirector()
//					+"-"+itemsOrdered.get(i).getLength()+":"+itemsOrdered.get(i).getCost());
//		}
//		System.out.println("Total cost: "+totalCost());
//		System.out.println("***********************************");
//	}
    public void placeOrder() {
        System.out.println("An order is created");
        itemsOrdered.removeAll(itemsOrdered);
    }
    public void printSize() {
        System.out.println("Number of media in cart:" + itemsOrdered.size());
    }
    public Media findMediaID(int id) {
        for(int i=0;i<itemsOrdered.size();++i) {
            if(id == itemsOrdered.get(i).getId());
            return (itemsOrdered.get(i));
        }
        return null;
    }
    public Media findMediaTitle(String title) {
        for(int i=0;i<itemsOrdered.size();i++) {
            if(title.equals(itemsOrdered.get(i).getTitle()));
            return (itemsOrdered.get(i));
        }
        return null;
    }
    public void sortTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
        System.out.println(itemsOrdered);
    }
    public void sortCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
        System.out.println(itemsOrdered);
    }
}