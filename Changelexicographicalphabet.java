package striver.Tcs;

import java.util.Scanner;

public class Changelexicographicalphabet {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your sentense ");
        String input=kb.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch>=65 && ch<=89 || ch>=97 && ch<=121)
                ch=(char)(ch+1);
            else if(ch=='z')
                ch='a';
            else if(ch=='Z')
                ch='A';
            sb.append(ch);
        }
        String output=sb.toString();
        System.out.println("output "+output);
    }
}
