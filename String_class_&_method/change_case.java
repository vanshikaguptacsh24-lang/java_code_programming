// User function Template for Java

// function to print the two string
// first string: the first character is changed
// to uppercase
// second string: complete string is changed
// to upper case.
// print both the string in new line.
class Solution {
    public static void changeCase(String s) {
        // code here
        
        String firstCaplitalized = s.substring(0,1).toUpperCase ()+s.substring(1);
        System.out.println(firstCaplitalized);
        
        String allUpperCase = s.toUpperCase();
        System.out.println(allUpperCase);
    }
}
