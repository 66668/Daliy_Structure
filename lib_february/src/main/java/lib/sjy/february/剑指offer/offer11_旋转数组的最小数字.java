package lib.sjy.february.剑指offer;


import java.util.Stack;

/**
 * 力扣154
 *假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 注意数组中可能存在重复的元素。
 *
 *
 */
public class offer11_旋转数组的最小数字 {

    public static void main(String[] args) {

    }

    public static int minArray(int[] numbers) {
        int findVal=numbers[0];
        for(int i = 0;i<numbers.length;i++){
            if(findVal > numbers[i]){
                return numbers[i];
            }
            findVal=numbers[i];
        }
        return numbers[0];
    }

}