package composite;

public class Book implements LibraryItem {

    private int series_position=0;

    public Book (int series_position) {
        this.series_position = series_position;
    }

    @Override
    public void render() {
        System.out.println("Rendering BOOK");
        System.out.println(".... showing BOOK title & author");
        if( this.series_position>0)
            System.out.println(".... showing BOOK series position "+series_position);
    }

    public int series_position() {
        return series_position;
    }

}