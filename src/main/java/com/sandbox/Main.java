package com.sandbox;

import java.util.Arrays;

class Solution {

    int[] d = {1, 2, 2, 3, 3, 2, 1};

    public int removeDuplicates(int[] nums) {
        int uniqueElement = 0;
        int b = 0;
        int position = 0;
        int element = 0;
        for (int i = 0; i < nums.length; i++) {

            uniqueElement = nums[i];
            if (uniqueElement == -1) continue;
            int k = i + 1;

            //заменяем всех кроме предыщего, так как он уникальный
            for (int q = k; q < nums.length; q++) {

                if (nums[q] == uniqueElement) {
                    nums[q] = -1;
                    int temp = nums[nums.length-2];
                    nums[nums.length-1] = nums[q];
                    nums[q] = temp;
                } else {
                    position = q;
                    element = nums[q];
                    nums[position] = element;
                }
            }

        }


        return 1; // Возвращаем количество уникальных элементов
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.removeDuplicates(s.d);
        Arrays.stream(s.d).forEach(System.out::print);// Выводим результат
    }
}
