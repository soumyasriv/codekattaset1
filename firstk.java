import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int sum=0;
for(int i=0;i<=k;i++)
{
sum+=i;
}
System.out.println(sum);
}}
