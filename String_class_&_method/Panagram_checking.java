class Solution {

    public static boolean isPanagram(String str) {
        // Your code here
        str = str.toLowerCase();
        boolean[] alphabetPresent = new boolean[26];
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                int index = c-'a';
                alphabetPresent[index] = true;
                
            }
            
        }
        for(boolean present : alphabetPresent) {
            if(!present){
                return false;
            }
        } 
        return true;
    }
}
