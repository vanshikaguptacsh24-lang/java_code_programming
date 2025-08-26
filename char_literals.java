// Java program to illustrate the
// application of char literals

public class Geeks {
    public static void main(String[] args) {
        // single character literal within single quotes
        char ch = 'a';

        // invalid octal literal (causes compilation error)
        // char b = 0789; 

        // Unicode representation
        char c = '\u0061'; 

        System.out.println(ch);
        
        // commented out due to error
        // System.out.println(b); 
        
        System.out.println(c);

        // Escape character literal
        System.out.println("\"  is a symbol");
    }
}
