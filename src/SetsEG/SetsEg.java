package SetsEG;

import java.util.*;

public class SetsEg {

    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(4);
        nums.add(20);
        nums.add(6);
        nums.add(7);
        nums.add(4);

        //Iterator
        Iterator<Integer> values= nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        System.out.println();
        for (int n : nums) {
            System.out.println(n);
        }
    }}
