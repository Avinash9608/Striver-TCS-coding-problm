package striver.Tcs;

import java.util.Scanner;

public class CountNumberOfEachDifferChar {
    private static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your complete sentence");
        String input=kb.nextLine();
        int vowel=0;
        int consonent=0;
        int whiteSpace=0;
        int symbol=0;
        for (int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(isVowel(ch))
                    vowel++;
                else
                    consonent++;
            }
            else if(ch==' ')
                whiteSpace++;
            else
                symbol++;
        }
        System.out.println("vowel="+vowel+" ,consonent="+consonent+" ,whitespaces="+whiteSpace+" ,symbol"+symbol);
    }
}
