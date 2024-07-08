package striver.Tcs;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharInString {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your sentense ");
        String input=kb.nextLine();
        char[] arr=input.toCharArray();
        Arrays.sort(arr);
        String result=new String(arr);
        System.out.println(result);
    }
}
