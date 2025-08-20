import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Geeks", "For", "Geeks"};

        Arrays.stream(arr).forEach(System.out::println); // Stream API
    }
}
