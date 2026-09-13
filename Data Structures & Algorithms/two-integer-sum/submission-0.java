class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2){
            return new int[]{0,1};
        }
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(numbers.containsKey(diff)){
                int j = numbers.get(diff);
                if(i<j){
                    return new int[]{i,j};
                } else {
                    return new int[]{j,i};
                }
                
            } else {
                numbers.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
