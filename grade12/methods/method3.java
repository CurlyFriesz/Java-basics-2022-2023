import java.util.*;

public class method3 {
    static int[]sequence(int start, int n, int add){
        int [] ans = new int[n];
        int val = start;
        for(int i = 0; i < n; i++) {
            ans[i] = start;
            val += add;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums = sequence(100, 10, 23);
        System.out.println(Arrays.toString(nums));
    }
}
