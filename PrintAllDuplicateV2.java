package striver.Tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintAllDuplicateV2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.next();
       int[] counts=new int[26];
       for (int i=0;i<input.length();i++)
       {
           counts[input.charAt(i)-'a']++;
       }
       for (int i=0;i<26;i++)
       {
           if(counts[i]>1)
           System.out.println((char)(i+'a')+" "+counts[i]);
       }
    }
}
