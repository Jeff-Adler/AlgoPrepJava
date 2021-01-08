import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 3, 3, 3 };
        System.out.println(arr);
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> numTracker = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (numTracker.get(arr[i]) == null) {
                numTracker.put(arr[i], 1);
            } else {
                numTracker.put(arr[i], numTracker.get(arr[i]) + 1);
            }
        }

        int luckyNum = -1;

        for (Map.Entry<Integer, Integer> entry : numTracker.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                luckyNum = entry.getValue();
            }
        }

        return luckyNum;
    }
}
