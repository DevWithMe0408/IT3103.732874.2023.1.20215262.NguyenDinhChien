package lap_04.AimesProject;

import java.util.ArrayList;
import java.util.List;

import lap_04.AimesProject.Cart;
import lap_04.AimesProject.Media.Book;
import lap_04.AimesProject.Media.CompactDisc;
import lap_04.AimesProject.Media.DigitalVideoDisc;
import lap_04.AimesProject.Media.Media;
import lap_04.AimesProject.Media.Track;

public class CartTest {

    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        List<Track> trackes  = new ArrayList<Track>();
        Track trk1 = new Track("track1",2);
        trackes.add(trk1);
        CompactDisc cd = new CompactDisc("CD1","pop","bile",0.5f,"bile",trackes);
        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD2","movie","david",30,1.3f);
        Book book = new Book();
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
        for(Media m: mediae) {
            System.out.println(m.toString());
        }
    }
}
