package striver.Tcs;

import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input ");
        String input=kb.nextLine();
        StringBuilder sb=new StringBuilder();
        String[] words=input.split(" ");
        for (String word:words)
        {
            sb.append(word);
        }
        System.out.println(sb);
    }
}
