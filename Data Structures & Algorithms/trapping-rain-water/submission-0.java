class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int l = 0;
        int n = height.length;
        int r = n - 1;
        int lmax = height[0];
        int rmax = height[n - 1];
        int ans = 0;
        while(l < r){
           lmax = Math.max(lmax , height[l]);
           rmax = Math.max(rmax, height[r]);
           if(lmax <= rmax){
            ans += lmax - height[l];
            l++;
           }else{
            ans += rmax - height[r];
            r--;
           }
        }
        return ans;
        
    }

   
}
