package strings;
import java.util.Scanner;
class Anagrams2
{
    public static void main(String[] args)
    {
        String s1,s2;
        int i,j,index;
        boolean bl=true;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first string");
        s1=sc.nextLine();
        System.out.println("enter second string");
        s2=sc.nextLine();
        int a[]=new int[256];
        int b[]=new int[256];
        for(char c:s1.toCharArray())
        {
            index=(int)c;
            a[index]++;
        }
        for(char c:s2.toCharArray())
        {
            index=(int) c;
            b[index]++;
        }
        for(i=0;i<256;i++)
        {
            if(a[i]!=b[i])
            {
                bl=false;
                break;
            }

        }
        if(bl)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
}