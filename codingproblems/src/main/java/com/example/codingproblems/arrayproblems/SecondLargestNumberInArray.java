package com.example.codingproblems.arrayproblems;

public class SecondLargestNumberInArray {
    public static void main(String[] args){
//        int[] arr = {3,5,8,9,2,12,56,76,56,34};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Second Largest number : " + secondLargestNumber(arr));
    }

    public static int secondLargestNumber(int[] arr){
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] > firstLargestNumber){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = arr[i];
            } else if (arr[i] > secondLargestNumber && arr[i] != firstLargestNumber){
                secondLargestNumber = arr[i];
            }
        }
        return secondLargestNumber;
    }
}