class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(arr.get(i) >= 0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
        
        int i = 0, p = 0, q = 0;
        while(p < pos.size() && q < neg.size()){
            arr.set(i++, pos.get(p++));
            arr.set(i++, neg.get(q++));
        }
        while(p < pos.size()){
            arr.set(i++, pos.get(p++));
        }
        while(q < neg.size()){
            arr.set(i++, neg.get(q++));
        }
    }
}