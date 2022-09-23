package com;

import java.util.ArrayList;

public class Demo10 {

    public static void main(String[] args) {
        ArrayList<ArrayList> list = new ArrayList<>();
        ArrayList<String> srcDes = new ArrayList<>();
        srcDes.add("B");
        srcDes.add("C");
        ArrayList<String> srcDes1 = new ArrayList<>();
        srcDes1.add("D");
        srcDes1.add("B");

        ArrayList<String> srcDes2 = new ArrayList<>();
        srcDes2.add("C");
        srcDes2.add("A");

        list.add(srcDes);
        list.add(srcDes1);
        list.add(srcDes2);
        System.out.println(list);

        ArrayList<String> secondElement  = new ArrayList<>();
        for(ArrayList<ArrayList<String>>  elemnt :list){

           secondElement.add(String.valueOf(elemnt.get(0)));
        }
        for(ArrayList<ArrayList<String>>  elemnt :list){

           if(!secondElement.contains(elemnt.get(1))){
               System.out.println(elemnt.get(1));
           }
        }
    }
}
