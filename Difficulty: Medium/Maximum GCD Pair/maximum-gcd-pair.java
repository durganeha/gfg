// User function Template for Java

class Solution {
    static int MaxGcd(int n, int a[]) {
        // complete the function here
        int max = 0; 
        for(int num : a){
            if(num > max){
                max = num;
            }
        }
        int freq[] = new int[max + 1];
        for(int i = 0; i < n; i++){
            freq[a[i]]++;
        }
        for(int g = max; g >= 1; g--){
            int count = 0;
            for(int multiple = g; multiple <= max; multiple += g){
                count += freq[multiple];
                
                if(count >= 2){
                    return g;
                }
            }
        }
        return 1;
    }
}