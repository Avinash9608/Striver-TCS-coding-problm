package striver.Tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.next();
        HashMap<Character,Integer> hm=new HashMap<>(26);
        for (int i=0;i<input.length();i++)
        {
            hm.put(input.charAt(i),hm.getOrDefault(input.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()==1)
                System.out.println("Key "+entry.getKey()+", value= "+entry.getValue());
        }
    }
}
