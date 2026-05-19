class Solution {
    public int findUnique(int[] arr) {
        // code here
        int ans = 0;
        for(int num : arr){
            ans = ans ^ num;
        }
        return ans;
    }
}