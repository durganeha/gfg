class Solution {
    public ArrayList<Integer> printPat(int n) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = n; j > 0; j--){
                for(int k = 0; k < n-i; k++){
                    arr.add(j);
                }
            }
            arr.add(-1);
        }
        return arr;
    }
}