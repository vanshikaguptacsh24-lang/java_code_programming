class Solution {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {   // start from 1, not 0
            fact = fact * i;
        }
        return fact;
    }
}
