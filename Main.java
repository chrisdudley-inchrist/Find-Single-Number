import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Given a non-empty array of integers,
 * every element appears twice except for one.
 * Find that single one.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("The single number: " + singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        int singleNum = 0;
        int value;
        HashMap<Integer, Integer> integers = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            integers.put(i,0);
        }

        for (int i : nums) {
            value = integers.get(i);
            integers.put(i, value+=1);
        }

        for (int i = 0; i < 10; i++) {
            if (integers.get(i).equals(1)) {
                singleNum = i;
                break;
            }
        }

        return singleNum;
    }

}



