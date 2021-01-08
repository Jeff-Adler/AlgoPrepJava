import java.util.ArrayList;
import java.util.HashMap;

public class EliminateDuplicates {
    public static void main(String[] args) {

    }

    public static String removeStringDuplicates(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }

    private static Integer[] removeArrayDuplicates(Integer[] origArray) {

        for (int j = 0; j < origArray.length - 1; j++) {
            for (int i = j + 1; i < origArray.length - 1; i++) {
                if (origArray[j] == origArray[i]) {
                    origArray[i] = null;
                }
            }
        }

        origArray[origArray.length - 1] = null;

        return origArray;
    }

    private static Integer[] removeSortedArrayDuplicates(Integer[] origArray) {

        Integer[] tempArray = new Integer[origArray.length];

        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++) {
            Integer currentElement = origArray[indexI];

            if (currentElement != origArray[indexI + 1]) {
                tempArray[indexJ++] = currentElement;
            }
        }

        tempArray[indexJ++] = origArray[origArray.length - 1];

        return tempArray;
    }
}
