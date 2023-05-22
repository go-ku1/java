package strings;
import java.util.Scanner;
public class Anagrams
{
    public static void main(String[] args)
    {
        String s1,s2;
        int i,j;
        boolean b=false;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first string");
        s1=sc.nextLine();
        System.out.println("enter second string");
        s2=sc.nextLine();
        boolean visited[]= new boolean[s2.length()];
        for (i=0;i<s2.length();i++)
        {
            visited[i]=false;
        }
        if(s1.length()==s2.length())
        {
            for (i = 0; i < s1.length(); i++) {
                b = false;
                for (j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j) && !visited[j]) {
                        b = true;
                        visited[j] = true;
                        break;
                    }
                }
                if (!b)
                    break;
            }
        }
        if(b)
            System.out.println("anagram");
        else
        System.out.println("not anagram");



    }
}
