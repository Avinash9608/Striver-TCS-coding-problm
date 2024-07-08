package striver.Tcs;

import java.util.Scanner;

public class RemoveCharFromStrExceptAlphabet {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
                sb.append(ch);
        }
        System.out.println("Output only with alphabet->"+sb);
    }
}
