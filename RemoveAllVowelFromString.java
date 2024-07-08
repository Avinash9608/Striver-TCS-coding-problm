package striver.Tcs;

import java.util.Scanner;

public class RemoveAllVowelFromString {
    public static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
                Scanner kb=new Scanner(System.in);
                System.out.println("Enter your input ");
                String input=kb.nextLine();
                StringBuilder sb=new StringBuilder();
                for (int i=0;i<input.length();i++)
                {
                    char ch=input.charAt(i);
                    if(Character.isAlphabetic(ch))
                    {
                        if(isVowel(ch)!=true)
                        {
                            sb.append(ch);
                        }
                    }
                }
                System.out.println(sb);
            }
        }
