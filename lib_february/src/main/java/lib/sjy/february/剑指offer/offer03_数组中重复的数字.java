package lib.sjy.february.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class offer03_数组中重复的数字 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 0, 2, 5, 3};
        findRepeatNumber(a);
    }

    public static int findRepeatNumber(int[] nums) {
        int temp = -1;
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums.length) {//TODO 边界点
            if (map.get(nums[i]) != null) {
                temp = i;
                break;
            } else {
                map.put(nums[i], i);
            }
            i++;
        }
        System.out.println(nums[i]);
        if(temp !=-1){
            return nums[temp];//易错点
        }else{
            return temp;
        }
    }
}