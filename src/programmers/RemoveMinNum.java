package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveMinNum {
    public static void main(String[] args) {
        int arr[] = {2,5,12,4,75,6,1,17};
        String a[] = {"a", "bbb"};
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder());
    }
}
