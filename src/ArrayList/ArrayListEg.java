package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEg {

    public static void main(String[] args){

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        for(int n: nums){
            System.out.println(n);
        }

    }
}
