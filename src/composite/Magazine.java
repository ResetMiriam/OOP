package composite;

public class Magazine implements LibraryItem {
    public Magazine(String magazineName) {
    }

    @Override
    public void render() {
        System.out.println("Rendering MAGAZINE");
        System.out.println(".... showing MAGAZINE title & author");
        System.out.println(".... showing MAGAZINE publication date");
    }

}