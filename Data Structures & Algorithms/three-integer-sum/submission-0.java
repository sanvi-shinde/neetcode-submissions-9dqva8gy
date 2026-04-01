class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        if(n < 3){
            return list;
        }
        Arrays.sort(nums);
        
        for(int i = 0 ; i < n - 2 ; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            if (nums[i] > 0) break;
            if (nums[i] + nums[n - 1] + nums[n - 2] < 0) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) break;
         int left = i + 1, right = n - 1;
          while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    list.add(List.of(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }
        return list;
        }
    }
