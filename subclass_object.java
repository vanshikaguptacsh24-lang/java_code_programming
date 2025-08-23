abstract class GeeksHelp {
    abstract void check(String name); // Abstract method
}

public class Geeks extends GeeksHelp {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Subclass object
        obj.check("GeeksforGeeks");
    }
}
