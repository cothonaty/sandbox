package com.sandbox;

import java.util.Arrays;

class Solution {

    int[] d = {1, 3,2, 2,2, 3, 3, 2, 1};


    public int removeDuplicates(int[] nums) {
        int uniqueElement = 0;
        for (int i = 0; i < nums.length; i++) {
            uniqueElement = nums[i];
            int k = i + 1;
            //заменяем всех кроме предыщего, так как он уникальный
            for (int q = k; q < nums.length; q++) {
                if (nums[q] == uniqueElement) {
                    nums[q] = -1;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == -1) {
                for (int q = i + 1; q < nums.length; q++) {
                    if (nums[q] != -1) {
                        nums[i] = nums[q];
                        nums[q] = -1;
                    }
                }
            }

        }
        int result=0;
        for (int i =0; i<nums.length;i++){
           if(nums[i] ==-1){
               result = i;
               break;
           }
        }
            return result;
         // Возвращаем количество уникальных элементов
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(s.d));
        Arrays.stream(s.d).forEach(System.out::print);// Выводим результат

    }
}
