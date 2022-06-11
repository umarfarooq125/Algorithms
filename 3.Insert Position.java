
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index = search(nums, 0, nums.length-1, target);
        return index;
    }
    
    public int search(int[] nums, int left, int right, int target){
        
        if(nums[nums.length-1]  < target) return nums.length;
        
        if(left >= right) return left;
        
        int mid = (left + right)/2;
        
        if(nums[mid] < target) return search(nums, mid+1, right, target);
        else if(nums[mid] > target) return search(nums, left, mid, target);
        return mid;
    }
}
