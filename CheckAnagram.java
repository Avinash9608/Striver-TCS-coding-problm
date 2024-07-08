package striver.Tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter input ");
        String input=kb.next();
        System.out.println("Enter anagram ");
        String input2=kb.next();
        Map<Character, Integer> hm=new HashMap<>();
        for (int i=0;i<input.length();i++)
        {
            hm.put(input.charAt(i),hm.getOrDefault(input.charAt(i),0)+1);
        }
        boolean result=true;
        if(input.length()!=input2.length())
            System.out.println("Not an anagrams of each other");
        else {
            for (int i = 0; i < input2.length(); i++) {
                if (hm.containsKey(input.charAt(i)) != true)
                    result = false;
                break;
            }
            if (result == true)
                System.out.println("Anagram ");
            else
                System.out.println("Not anagram");
        }
    }
}
