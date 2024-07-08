package striver.Tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveMaxOccurance {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.next();
        HashMap<Character,Integer> hm=new HashMap<>(26);
        for (int i=0;i<input.length();i++)
        {
            hm.put(input.charAt(i),hm.getOrDefault(input.charAt(i),0)+1);
        }
        char maxChar='\0';
        int maxOcc=Integer.MIN_VALUE;
        for (Map.Entry<Character,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>maxOcc)
            {
                maxChar=entry.getKey();
                maxOcc= entry.getValue();
            }
        }
        System.out.println("Max occ char "+maxChar+", with freq "+maxOcc);

    }
}
