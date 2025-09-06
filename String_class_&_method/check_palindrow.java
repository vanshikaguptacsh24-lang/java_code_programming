class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        
        while(left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
                
            }
            left ++;
            right--;
            
        }
        return true;
    }
}
