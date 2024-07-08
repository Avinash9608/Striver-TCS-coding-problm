package striver.Tcs;

import java.util.Scanner;

public class FindASCIIValueOfChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your char ");
        char input=kb.next().charAt(0);
        System.out.println("ASCII is "+(int)input);
    }
}
