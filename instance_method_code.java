// Java program to demonstrate the use of instance method
import java.io.*;

class Test {
    String n = "";

    // Instance method 
    public void test(String n) { 
      this.n = n; 
    }
}
class Geeks {
    public static void main(String[] args) {

        // create an instance of the class
        Test t = new Test();

        // calling an instance method in the class 'Geeks'
        t.test("GeeksforGeeks");
        System.out.println(t.n);
    }
}
