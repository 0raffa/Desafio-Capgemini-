package com.capgemini;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrama {

    public static void main(String[] args) {


        System.out.println(anagrama("ifailuhkqq"));
    }

    static int anagrama(String s) {
        int cont=0; 
        Map<String, Integer> map = new HashMap<>(); 

        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                char[] letra = s.substring(i, j).toCharArray(); 
                Arrays.sort(letra);
                String str2 = new String(letra);

                map.put(str2, map.getOrDefault(str2, 0)+1); 
            }
        }

        for (Map.Entry e : map.entrySet()){
            int valor = (int)e.getValue(); 
            cont+= valor*(valor-1)/2; 
        }
        return cont;
    }
}