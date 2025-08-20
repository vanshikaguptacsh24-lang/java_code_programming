import java.util.*;

class Solution {
    public static int[] removeDuplicates(int[] arr) {
        // If array is empty or has 1 element, just return it
        if (arr.length <= 1) {
            return arr;
        }

        // Use a list to store unique elements
        ArrayList<Integer> result = new ArrayList<>();

        // Add the first element
        result.add(arr[0]);

        // Compare each element with the previous one
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {   // Only add if different
                result.add(arr[i]);
            }
        }

        // Convert ArrayList to int[]
        int[] uniqueArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArr[i] = result.get(i);
        }

        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2, 2, 2};
        int[] arr2 = {1, 2, 4};

        System.out.println(Arrays.toString(removeDuplicates(arr1))); // [2]
        System.out.println(Arrays.toString(removeDuplicates(arr2))); // [1, 2, 4]
    }
}
