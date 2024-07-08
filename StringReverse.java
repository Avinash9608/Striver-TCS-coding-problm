package striver.Tcs;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.next();
        StringBuilder sb=new StringBuilder(input);
        sb.reverse();
        input=sb.toString();
        System.out.println("Reverse is "+input);
    }
}
