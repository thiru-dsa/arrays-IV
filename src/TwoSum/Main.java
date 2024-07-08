package TwoSum;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 7;
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums, target);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int maxValue = 0;
        int[] resultIndex = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int iterator = 0; iterator < nums.length; iterator++) {
            int num = nums[iterator];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)) {
                resultIndex[0] = map.get(moreNeeded);
                resultIndex[1] = iterator;
            }

            map.put(nums[iterator], iterator);
        }

        return resultIndex;
    }
}