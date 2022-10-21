package com;

import java.util.ArrayList;
import java.util.List;

public class DemoClass {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Ravi");
        for(final String sname :str){
            //sname= new String ("hello");
            System.out.printf(sname);
        }
    }
}
