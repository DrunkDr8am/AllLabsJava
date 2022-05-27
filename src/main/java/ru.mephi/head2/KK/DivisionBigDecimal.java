package ru.mephi.head2.KK;


import java.util.Random;

public class DivisionBigDecimal {
    public static void main(String[] args){
       StringBuilder sb = new StringBuilder();
       int n = 1000000;
       int m = 10;
       String str="";
       for (int i=0; i<n; i++){
           str= str + generateString(m);
       }
        System.out.println(str);
    }

    public static String generateString(int length)
    {
        Random rng = new Random();
        String characters= "qwertyuiopasdfghjklzxcvbnm";
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

}