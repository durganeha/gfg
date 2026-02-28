class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int maxFromRight = arr[n-1];
        res.add(maxFromRight);
        
        for(int i = n-2; i >= 0; i--){
            if(arr[i] >= maxFromRight){
                maxFromRight = arr[i];
                res.add(arr[i]);
            }
        }
        Collections.reverse(res);
        
        return res;
    }
}
