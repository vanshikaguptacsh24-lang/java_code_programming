// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        int[] freq = new int [26];
        for (char c : s1.toCharArray()) {
            freq [c-'a']--;
        }
        for (char c : s2.toCharArray()){
            freq [c-'a']++;
            
        }
        for (int i =0; i<26;i++){
            if (freq[i]==1){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}
