package lap_04.AimesProject.Media;

import java.util.List;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track>tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, String director, float cost,
                       String artist, List<Track> tracks) {
        super(title,category,director,cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    public CompactDisc() {

    }
    //	public boolean equals(Object obj) {
//		if(obj instanceof Track) {
//			Track trk = (Track) obj;
//			return this.equals(trk.getTitle()) && this == trk.getLength();
//		}
//	}
    public void addTrack(Track track) {
        if(tracks.contains(track)) {
            System.out.println("The track is already in the list!");
            return;
        }
        tracks.add(track);
    }
    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
            return;
        }
        System.out.println("Cant find the track!");
    }

    public int getLength() {
        int sumLen = 0;
        for(int i=0; i<tracks.size();i++) {
            sumLen += tracks.get(i).getLength();
        }
        return sumLen;
    }
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD Length: " + this.getLength());
        for(int i=0;i<tracks.size();i++) {
            tracks.get(i).play();
        }
    }

    @Override
    public String toString() {
        return "CompactDisc: id"+ id +"artist=" + artist + ", tracks=" + tracks + ", length=" + length + ", director=" + director
                + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }
}
