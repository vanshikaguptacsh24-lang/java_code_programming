import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // Your Code Here
        int x = sc.nextInt();
        int i =x;
        while(i>=0){
            System.out.print(i);
            if(i>0){
                System.out.print(" ");
            }
            i--;
        }
        sc.close();
        
    }
}
