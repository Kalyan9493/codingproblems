package com.example.codingproblems.arrayproblems;

public class FirstOccuranceInArray {

    public static void main(String[] args){
//        int[] arr = {3,5,8,9,2,12,56,76,56,34};
        int[] arr = {1,2,3,4,5,6,7,8,9,10,-1,-8,-0};
        System.out.println("Max number is : " + firstOccuranceInArray(arr,8));
    }
    public static int firstOccuranceInArray(int[]arr, int key){
        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
