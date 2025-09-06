class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) {
            return false;
            
        }
        int[] freq = new int[26];
        
        for (char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        for (char c : s2.toCharArray()){
            freq[c-'a']--;
        }
        for (int count : freq){
            if (count != 0){
                return false;
            }
        }    
        return true;
    }
}
