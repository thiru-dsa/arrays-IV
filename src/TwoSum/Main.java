package TwoSum;

import org.w3c.dom.ls.LSOutput;

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
        int[] resultIndex = new int[2];
        for(int iterator = 0; iterator < nums.length; iterator++) {
            for(int jterator = iterator + 1; jterator < nums.length; jterator++) {
                if((nums[iterator] + nums[jterator]) == target) {
                    resultIndex[0] = iterator;
                    resultIndex[1] = jterator;

                    return resultIndex;
                }
            }
        }

        return resultIndex;
    }
}