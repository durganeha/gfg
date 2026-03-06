class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long actualSum = n * (n + 1) / 2;
        long evalSum = 0;
        
        for(int num : arr){
            evalSum += num;
        }
        return (int)(actualSum - evalSum);
    }
}