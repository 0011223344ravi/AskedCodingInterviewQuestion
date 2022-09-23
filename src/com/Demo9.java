package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo9 {

    public static void main(String[] args) {

        int [] arr = {1, 2, 1, 3, 4, 5, 2, 1,5};

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        //ArrayList<Integer>  al  = new ArrayList<>();
        for(int i  =0; i< arr.length; i++){

          if(hm.containsKey(arr[i])){
                ArrayList<Integer>  anew =hm.get(arr[i]);
                anew.add(i);
                hm.put(arr[i],anew);
            }

          else {
             ArrayList<Integer>  anew = new ArrayList();
             anew.add(i);
                hm.put(arr[i],anew);
          }
        }
        System.out.println(hm);
    }
}
