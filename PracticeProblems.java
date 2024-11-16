public class PracticeProblems {
    public static int[] arrA = {1, 2, 1, 3, 1, 4, 2, 3, 4, 5, 6};
    public static int countOccurrences(int n, int[] arr) {
        int numberCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                numberCount ++;
            }
        }
        return numberCount;
    }
    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int putNum = 0;
        int numberPosition = arr.length - 1;
        while (numberPosition >= 0) {
            int newInput = arr[numberPosition];
            newArr[putNum] = newInput;
            numberPosition --;
            putNum ++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        System.out.println(countOccurrences(2, arrA));
        System.out.println(reverseArray(arrA));
    }
}


