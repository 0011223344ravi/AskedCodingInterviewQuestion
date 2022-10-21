package com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7 {

    public static char getFirstNonRepeatingCharacter(String str) {
  char ans =' ';
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (hm.containsKey(ch[i])) {
                hm.put(ch[i], hm.get(ch[i]) + 1);
            } else {
                hm.put(ch[i], 1);
            }

        }
   for(Character ch1:ch){

      if(hm.get(ch1) ==1){
       return ch1;
       //break;
      }
   }
     return ' ';
    }

    public static void main(String[] args) {
        String str = "hellohowareyou";
        char ch =getFirstNonRepeatingCharacter(str);
        System.out.println(ch);


    /*    char [] chars = str.toCharArray();
      HashMap<Character,Integer>  hm = new HashMap<>();
      for(Character ch :chars){

         if(hm.containsKey(ch)) {
             hm.put(ch, hm.get(ch) + 1);
         }
         else{
             hm.put(ch,   1);
         }
      }
        System.out.println(hm);

       List<Character>  list = new ArrayList<>();
       int count =0;
      for(int  i =0; i< str.length(); i++){

         if(hm.get(str.charAt(i))==1)  {
            if(count <2) {
                list.add(str.charAt(i));
                count ++;
            }
            // System.out.println(str.charAt(i));
           //  break;
         }
      }

        System.out.println(list.get(1));
    }

    //empList .stream().filter(e->e.getSalary >5000).forEach();*/
    }
}