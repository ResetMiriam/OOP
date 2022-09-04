package composite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Series implements LibraryItem {

    public String serieName;
    private ArrayList<LibraryItem> Series = new ArrayList<>();

    public Series(String serieName) {
        this.serieName = serieName;
    }

    //adding item to series
    public void add(LibraryItem s) {
        this.Series.add(s);
    }

    //removing item from series
    public void remove(LibraryItem s) {
        Series.remove(s);
    }

    @Override
    public void render() {
        System.out.println("Rendering SERIE");
        System.out.println(".... showing SERIE "+serieName);

    }
}
