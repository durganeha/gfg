class Solution {

    static int minOps(int arr[], int k) {
        // Your code here
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int operations = 0;
        for(int i = 0; i < arr.length; i++){
            int diff = max - arr[i];
            
            if(diff%k != 0){
                return -1;
            }
            
            operations += diff / k;
        }
        return operations;
    }
}
