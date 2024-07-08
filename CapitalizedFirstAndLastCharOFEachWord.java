package striver.Tcs;

import java.util.Scanner;

public class CapitalizedFirstAndLastCharOFEachWord {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your complete sentence ");
        String input=kb.nextLine();
        StringBuilder sb=new StringBuilder();
        String[] words=input.split(" ");
        int start=0;
        int last=0;
        for (String word:words)
        {
            start=0;
            last= word.length()-1;
            word=Character.toUpperCase(word.charAt(start))+word.substring(1,last)+Character.toUpperCase(word.charAt(last));
            sb.append(word);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
