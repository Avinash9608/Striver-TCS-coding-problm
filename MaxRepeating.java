package striver.Tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxRepeating {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your sentense ");
        String input=kb.nextLine();
        String[] words=input.split(" ");
        String strWithMaxRepeatedChar="";
        int maxRepeatedChar=0;
        for (String word:words)
        {
            Map<Character, Integer> currFreq=new HashMap<>();
            int maxfreq=0;
            for (int i=0;i<word.length();i++)
            {
                char currChar=word.charAt(i);
                int frequency=currFreq.getOrDefault(currChar,0)+1;
                currFreq.put(currChar,frequency);
                if(frequency>maxfreq)
                    maxfreq=frequency;
            }
            if(maxfreq>maxRepeatedChar)
            {
                maxRepeatedChar=maxfreq;
                strWithMaxRepeatedChar=word;
            }
        }
        System.out.println(strWithMaxRepeatedChar);
    }
}
