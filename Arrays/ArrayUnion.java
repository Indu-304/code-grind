import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> sorted = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] < b[p2]) {
                if (!sorted.contains(a[p1])) {
                    sorted.add(a[p1]);
                }
                p1++;
            } else if (a[p1] > b[p2]) {
                if (!sorted.contains(b[p2])) {
                    sorted.add(b[p2]);
                }
                p2++;
            }
            //if both elements are equal
             else {
                if (!sorted.contains(a[p1])) {
                    sorted.add(a[p1]);
                }
                p1++;
                p2++;
            }
        }
        //remaining elements from a
        while (p1 < a.length) {
            if (!sorted.contains(a[p1])) {
                sorted.add(a[p1]);
            }
            p1++;
        }
        //remaining elements from b
        while (p2 < b.length) {
            if (!sorted.contains(b[p2])) {
                sorted.add(b[p2]);
            }
            p2++;
        }
        return sorted;
    }
}
