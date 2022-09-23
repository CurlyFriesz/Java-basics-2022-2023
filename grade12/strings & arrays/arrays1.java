// Arrays in java
// primitive arrays simply point to a spot in memory where a
// bunch of values are. They do not frouw when you add things.
// Can not remove things and have them shrink.

import java.util.*;

public class arrays1 {
    public static void main(String[] args) {
        int []nums = new int[10];
        nums[0] = 12;
        System.out.println(Arrays.toString(nums));
        int []n2 = {1, 2, 3};
        nums = new int[]{21, 5452, 23};
        System.out.println(nums == n2);
        System.out.println(Arrays.equals(nums, n2));

        for(int i : nums) {
            System.out.println(i);
        }

        String line = "This is only a test";
        String [] words = line.split(" ");
        for(String w : words) {
            System.out.println(w);
        }
        for(char c : line.toCharArray()) {
            System.out.println(c+" ");
        }
    }
}

//ArrayList
