package com;

import java.util.HashMap;
import java.util.Map;

public class CompressTheString {

    public static int compress(char[] chars) {
        String str  ="";
        HashMap<Character ,Integer> hm = new HashMap<>();
        for(int i =0; i< chars.length; i++) {
            if(hm.containsKey(chars[i])) {
                hm.put(chars[i], hm.get(chars[i]) + 1);
            }
            else {
                hm.put(chars[i], 1);
            }


        }
        for(Map.Entry<Character, Integer> entry :hm.entrySet()){
            if(entry.getValue() ==1){
                str = str +entry.getKey();

            }
            else {
                str = str + entry.getKey() + entry.getValue();
            }
        }

        for(int i = 0; i<chars.length && i<str.length(); i++){
            chars[i] = str.charAt(i);
        }
        return str.length();


    }

    public static void main(String[] args) {
       char ch [] = {'a','a','b','b','c','c','c'};
       int n = compress(ch);
        System.out.println("n "+n);

    }


}
