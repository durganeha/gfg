class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int start = 0; start < arr.length; start++){
            for(int end = start; end < arr.length; end++){
                List<Integer> sub = new ArrayList<>();
                for(int i = start; i <= end; i++){
                    sub.add(arr[i]);
                }
                ans.add(sub);
            }
        }
        return ans;
    }
}