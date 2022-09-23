package com;

public class Demo {
    public static void swap(int x, int y){

        int temp =x;
        x=y;
        y=temp;
    }

    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        for(int i  =1; i<n+1; i++){
            for(int j =0; j<n-i;j++){

                if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] =temp;

                }
            }
        }
    }

    public  static void printArray(int arr[] ,int n){

        for(int i =0; i< n ; i++)
          System.out.println(arr[i]);
    }
    public static void main(String[] args) {
       int  N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        bubbleSort(arr,N);
        printArray(arr,N);

    }
}
