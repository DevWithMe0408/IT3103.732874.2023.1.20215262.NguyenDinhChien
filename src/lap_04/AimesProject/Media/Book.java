package lap_04.AimesProject.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public void addAuthor(String authorName) {
        if(authors.contains(authorName)) {
            System.out.println("Author has already in list");
            return;
        }
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
            return;
        }
        System.out.println("Cant find author!");
    }
    public Book(String title, String category, float cost) {
        super(title,category,cost);
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Book() {

    }
    @Override
    public String toString() {
        return "Book: ID" + id + "  Title:" + title + "," +"  Authors:" + authors
                + ", Category:" + category + ",Cost:" + cost;
    }

}