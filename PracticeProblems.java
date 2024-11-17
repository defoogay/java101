//Problems
//Write a function called countOccurrences that takes an integer array arr and an integer n, and returns the number of times that n appears in arr.
//Write a function called reverseArray that takes an integer array arr and returns a new array with the elements of arr but in reverse order.
//Write a function called sumGrid that takes a 2d double array grid and returns the sum of all the elements. Hint: you can do this with nested for loops (look up what that is).
//Write a function called fib that takes an integer n and returns the nth number in the fibonacci sequence (starting with 0 1).

public class PracticeProblems {
    public static int[][] twoArr = {{12,13,14}, {22, 23, 24}, {32, 33, 34}};
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
        static String IntArrayToString(int[] arr) {
            String Result = "Array: | ";
            for (int i = 0; i < arr.length; i++){
                Result = Result + arr[i] + " | ";
            }
            return Result;
        }
        static int sumGrid(int[][] arr) {
            int numberHolder = 0;
            int greaterNumber = 0;
            for(int i = 0; i < arr.length; i++) {
                greaterNumber += arr[i];
                for(int x = 0; x < arr.length; x++) {
                    numberHolder += arr[i][x];
                }
            }
        }
    public static void main(String[] args) {
        System.out.println(countOccurrences(2, arrA));
        System.out.println(IntArrayToString(reverseArray(arrA)));;
    }
}