package composite;

import java.util.List;

public class Series implements LibraryItem {

    public String serieName;
    public int serieId;
    public List<String> listBooks;


    public Series(String serieName, int serieId, List<String> listBooks) {
        this.serieName = serieName;
        this.serieId = serieId;
        this.listBooks = listBooks;


    }

    public int getNoBooks() {
        return listBooks.size();
    }

    public void expands() {
        listBooks.forEach(System.out::println);
    }

    @Override
    public void render() {
        System.out.println("Rendering SERIES");
        System.out.println(".... showing SERIE " + serieName);
        System.out.println(".... this serie has " + getNoBooks() + "books");
        System.out.println(".... The books of this serie are: ");
        expands();
    }
}
