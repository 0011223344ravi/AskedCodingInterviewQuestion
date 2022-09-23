package com;

public class FabonaciSum {
    public static int sumFab(int n ){
     if(n<=0)
         return 0;

        int arr [] = new int [n+1];
        arr[0] =0;
        arr[1]=1;

        int sum =  arr[0]+arr[1];
        for(int i  =2; i<= n ;i++){
          arr[i] =arr[i-1]+arr[i-2];
          sum+=arr[i];

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        sumFab(4);
    }
}
