package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class dailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        int size = T.length;
        int[] result = new int[size];
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < size - 1; i++) {
            set.add(i);

            for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
                Integer index = it.next();
                if (T[index] < T[i + 1]) {
                    result[index] = (i + 1) - index;
                    it.remove();
                }
            }
        }

        return result;
    }
}
