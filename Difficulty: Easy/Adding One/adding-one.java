// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int n = arr.length;
        Vector<Integer> res = new Vector<>();
        int carry = 1;
        
        for(int i = n-1; i >= 0; i--){
            int sum = arr[i] + carry;
            
            if(sum == 10){
                arr[i] = 0;
                carry = 1;
            }
            else{
                arr[i] = sum;
                carry = 0;
                break;
            }
        }
        
        if(carry == 1){
            res.add(1);
        }
        
        for(int i = 0; i < n; i++){
            res.add(arr[i]);
        }
        return res;
    }
}