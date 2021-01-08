class Solution {
    public static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {return false;}
        for (int i = 0 ; i < arr.length - 2 ; i++) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0  && arr[i+2] % 2 != 0){return true;}
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,7,6,3,5};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
