class Solution {
    // Function to return the length of the array
    public static int lengthOfArray(int[] arr) {
        return arr.length;   // Directly return the length
    }

    public static void main(String[] args) {
        int[] arr1 = {54, 43, 2, 1, 5};
        int[] arr2 = {324, 5, 2, 2};

        System.out.println(lengthOfArray(arr1)); // Output: 5
        System.out.println(lengthOfArray(arr2)); // Output: 4
    }
}
