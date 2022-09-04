package composite;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryItem {

    //collection of Shapes
    private List<LibraryItem> items = new ArrayList<LibraryItem>();

    @Override
    public void render() {
        for (LibraryItem sh : items) {
            sh.render();
        }
    }

    //adding item to library
    public void add(LibraryItem s) {
        this.items.add(s);
    }

    //removing item from library
    public void remove(LibraryItem s) {
        items.remove(s);
    }

    //removing all the items
    public void clear() {
        System.out.println("Clearing all the items from Library");
        this.items.clear();
    }
}
