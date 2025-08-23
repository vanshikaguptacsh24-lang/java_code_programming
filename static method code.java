// Java program to demonstrate the static method  
import java.io.*;

class Geeks {
  
  // static method 
  public static void greet(){
    
    System.out.println("Hello Geek!");
  }
    public static void main (String[] args) {
      
       // calling the method directily
       greet();
      
        // using the class name
        Geeks.greet();  
    }
}
