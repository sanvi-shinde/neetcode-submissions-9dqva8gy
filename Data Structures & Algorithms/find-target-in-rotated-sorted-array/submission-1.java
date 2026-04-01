class Solution {
    public int search(int[] nums, int target) {
         int pivot = findPivot(nums);
         if(pivot == 0){
            return binarySearch(nums , target , 0 , nums.length - 1);
         }
         if(target >= nums[0]){
            return binarySearch(nums , target , 0 , pivot - 1);
         }else{
            return binarySearch(nums , target , pivot , nums.length - 1);
         }

        
    }
    int binarySearch(int[] nums , int target , int start, int end){
        while(start <= end){
            int mid = start + (end - start) /2 ;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1 ;
            }
        }
        return -1;
    }

    int findPivot(int[] nums){
        
        int start = 0;
        int end = nums.length - 1 ;
        if (nums[start] <= nums[end]) {
            return 0;
        }
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid + 1 ;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return 0;
    }
}
