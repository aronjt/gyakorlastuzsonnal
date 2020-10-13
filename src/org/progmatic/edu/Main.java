package org.progmatic.edu;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }
    public static int minimum (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int evenNumbers (int[] arr) {
        int evenNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }
    public static int max (int[]arr ){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

        }return max;
    }
    public static int oddNumbers(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0){
                counter++;
            }
        }return counter;
    }
    public static int sumEven (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}