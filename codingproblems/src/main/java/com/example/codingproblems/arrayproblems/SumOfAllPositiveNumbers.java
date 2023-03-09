package com.example.codingproblems.arrayproblems;

public class SumOfAllPositiveNumbers {

    public static void main(String[] args){
//        int[] arr = {3,5,8,9,2,12,56,76,56,34};
        int[] arr = {1,2,3,4,5,6,7,8,9,10,-1,-8,-0};
        System.out.println("Sum of +ve numbers is : " + sumOfPositiveNumbers(arr));
    }
    public static int sumOfPositiveNumbers(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
