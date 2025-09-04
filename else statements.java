import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Input number

        if (a > 100) {
            System.out.println("Big");   // If greater than 100
        } else {
            System.out.println("Number"); // If smaller than or equal to 100
        }
    }
}
