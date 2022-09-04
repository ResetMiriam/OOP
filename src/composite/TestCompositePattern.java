package composite;


public class TestCompositePattern {

    public static void main(String[] args) {
        LibraryItem book1 = new Book(1);
        LibraryItem book2 = new Book(0);
        LibraryItem magazine = new Magazine();
        LibraryItem note = new Note(10);
        LibraryItem serie1 = new Series("The Lord of the Rings");

        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(magazine);
        library.add(note);
        library.add(serie1);

        library.render();

        // series_item.expand()
    }

}