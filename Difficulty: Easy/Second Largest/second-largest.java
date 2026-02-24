class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int secMax = -1;
        
        for(int n : arr){
            if(n > max){
                secMax = max;
                max = n;
            }
            else if(n > secMax && n < max){
                secMax = n;
            }
        }
        return secMax;
    }
}