package striver.Tcs;

import java.util.Scanner;

public class CountNoOfwords {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your sentense ");
        String input=kb.nextLine();
        String[] words=input.split(" ");
        System.out.println("Total number of words in your string "+words.length);
    }
}
