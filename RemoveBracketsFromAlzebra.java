package striver.Tcs;

import java.util.Scanner;

public class RemoveBracketsFromAlzebra {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your alzebric expression ");
        String input=kb.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch!=')' && ch!='(')
            {
                sb.append(ch);
            }
        }
        System.out.println("Expression is "+sb);
    }
}
