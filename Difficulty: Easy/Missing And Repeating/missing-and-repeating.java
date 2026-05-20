class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int duplicate = -1;
        int missing = -1;
        boolean[] visited = new boolean[n+1];
        
        for(int num : arr){
            if(visited[num]){
                duplicate = num;
            }
            else{
                visited[num] = true;
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                missing = i;
                break;
            }    
        }
        ans.add(duplicate);
        ans.add(missing);
        
        return ans;
    }
}
