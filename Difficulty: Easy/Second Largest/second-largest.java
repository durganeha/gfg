class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int secMax = -1;
        
        for(int n : arr){
            if(n > max){
                secMax = max;
                max = n;
            }
            else if(n < max && n >secMax){
                secMax = n;
            }
        }
        return secMax;
    }
}