
import java.util.HashMap;
 class Solution {
     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i}; // get the imdex of that complement and the current element
            }
            else{
                map.put(nums[i],i);//if the complement is not in the map, add that element in the map for later finding , baad ma uska complement mil skta h 
            }

        }
        return new int[]{};
     }
 }