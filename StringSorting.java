package week05;

import java.util.Arrays;

public class StringSorting {
    public static String sort(String s) {
        char[] c = s.toCharArray();   
        Arrays.sort(c);       
        return new String(c);
        }
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println(sort(s1));
    }
}