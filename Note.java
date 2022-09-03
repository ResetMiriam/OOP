package composite;

public class Note implements LibraryItem {

    private int line_count=0;

    public Note(int line_count){
        this.line_count = line_count;
    }

    @Override
    public void render() {
        System.out.println("Rendering NOTE");
        System.out.println(".... showing NOTE title & author");
        System.out.println(".... showing NOTE line count"+line_count);
    }



}
