package com;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

    public static void merge1 (int[] arr, int m, int[] arr1, int n){
        int i =0;
        int  j =0;
        int k  =0;
        int o =n+m;
        int arr2[] = new int [o];

        while(i<n && j <m){
            if(arr[i] > arr1[j]){
                arr2[k]=arr1[j];
                j++;
                k++;
            }
            else if(arr[i] < arr1[j]){
                arr2[k]=arr[i];
                i++;
                k++;
            }

        }
        for(int r =0; r<n; r++){
             arr1[r] = arr2[r];
        }
    }

    public static  void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i  =0; i<m ;i++){
            al.add(nums1[i]);
        }
        for(int i  =0; i<n ;i++){
            al.add(nums2[i]);
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        for(int i =0; i<m+n; i++){
            nums1[i]  = al.get(i);
        }
    }

    public static void main(String[] args) {


       int  nums1 [] = {1,2,3,0,0,0};
        int m = 3;
        int nums2 []= {2,5,6};
        int n = 3;

        merge(nums1,m,nums2,n);
    }
}
