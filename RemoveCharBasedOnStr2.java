package striver.Tcs;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveCharBasedOnStr2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input1 ");
        String input=kb.next();
        System.out.println("Enter your input2 ");
        String input2= kb.next();
//        System.out.println("Input1 "+input);
//        System.out.println("Input2 "+input2);
        HashMap<Character, Integer> input2Freq=new HashMap<>();
        for (int i=0;i<input2.length();i++)
        {
            input2Freq.put(input2.charAt(i),input2Freq.getOrDefault(input2.charAt(i),0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<input.length();i++)
        {
            if(input2Freq.get(input.charAt(i))==null)
                sb.append(input.charAt(i));
        }
        System.out.println(sb);
    }
}
