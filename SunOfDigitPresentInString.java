package striver.Tcs;

import java.util.Scanner;

public class SunOfDigitPresentInString {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.next();
        int sum=0;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch>='0' && ch<='9')
                sb.append(ch);
            else {
                if(sb.length()>0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(sb.length()>0) {
            sum += Integer.parseInt(sb.toString());
        }
        System.out.println(sum);
    }
}
