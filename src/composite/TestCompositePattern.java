package composite;


import java.util.Arrays;
import java.util.Collections;

public class TestCompositePattern {

    public static void main(String[] args) {
        LibraryItem book1 = new Book(1);
        LibraryItem book2 = new Book(0);
        LibraryItem magazine = new Magazine("Sun");
        LibraryItem note = new Note(10);
        LibraryItem serie1 = new Series("serie1", 4823, Arrays.asList("book3", "book4"));

        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(magazine);
        library.add(note);
        library.add(serie1);

        library.render();



    }

}