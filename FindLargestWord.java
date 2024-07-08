package striver.Tcs;

import java.util.Scanner;

public class FindLargestWord {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your sentense ");
        String input=kb.nextLine();
        String[] words=input.split(" ");
        int maxLength=0;
        String maxLenWord="";
        int maxcurrlength=Integer.MIN_VALUE;
        for (int i=0;i<words.length;i++)
        {
            if(words[i].length()>maxcurrlength)
                maxcurrlength=words[i].length();
            if(maxcurrlength>maxLength) {
                maxLength=maxcurrlength;
                maxLenWord = words[i];
            }
        }
        System.out.println("Max length is "+maxLength+" word = "+maxLenWord);
    }
}
