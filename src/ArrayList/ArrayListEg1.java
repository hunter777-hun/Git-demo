package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg1 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(nums.set(2,3));

        System.out.println(nums.get(2));

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
