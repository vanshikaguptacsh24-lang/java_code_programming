class Solution {
    public static void main(String[] args) {
        int[] arr = {54, 43, 2, 1, 5};

        // Traverse from last to first
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);  // Print element
            if (i > 0) {
                System.out.print(" "); // Print space except after last element
            }
        }
    }
}
