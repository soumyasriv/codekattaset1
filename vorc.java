import java.util.*;
class Solution
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("Vowel");
else if (c=='$')
System.out.println("Invalid");
else
System.out.println("Consonant");
}}
