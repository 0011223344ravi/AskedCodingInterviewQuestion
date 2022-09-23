package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo8 {

//1,apple , 60000
//2, nokia, 40000
//3, samsung, 30000

    public static void main(String[] args) {
        ArrayList<Product>  al  = new ArrayList<>();
        al.add(new Product(1,"apple",60000));
        al.add(new Product(2,"nokia",40000));
        al.add(new Product(3,"apple",30000));

        al.stream().filter(t->t.getPrice()>30000).collect(Collectors.toList()).forEach(System.out::println);
    }
}
