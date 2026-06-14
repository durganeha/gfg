class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b != 0){
            int remainder = b;
            b = a % b;
            a = remainder;
        }
        return a;
    }
}
