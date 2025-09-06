import java.io.*;// Use of Object and Classes in Java
import java.io.*;

class Numbers {
    // Properties
    private int a;
    private int b;

    // Setter methods
    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }

    // Methods
    public void sum() { System.out.println(a + b); }
    public void sub() { System.out.println(a - b); }

    public static void main(String[] args)
    {
        Numbers obj = new Numbers();

        // Using setters instead of direct access
        obj.setA(1);
        obj.setB(2);

        obj.sum();
        obj.sub();
    }
}

class GFG {
    public static void main (String[] args) {
        System.out.println("GFG!");
    }
}
