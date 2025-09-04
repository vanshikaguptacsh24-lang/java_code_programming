// User function Template for Java
class Solution {
    public static void fizzBuzz(int number) {
        // Write your code here.
        for (int i=1; i<=100; i++){
            if (i % 3==0 && i % 5 ==0){
                System.out.println("Fizzbuzz");
            }else if(i %3 ==0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
