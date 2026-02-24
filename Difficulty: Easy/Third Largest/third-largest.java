class Solution {
    int thirdLargest(int arr[]) {
        // code here
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
        if(arr.length < 3){
            return -1;
        }
        
        for(int n : arr){
            if(n > max){
                thirdMax = secMax;
                secMax = max;
                max = n;
            }
            else if(n > secMax){
                thirdMax = secMax;
                secMax = n;
            }
            else if(n > thirdMax){
                thirdMax = n;
                
            }
        }
        return thirdMax;
    }
}