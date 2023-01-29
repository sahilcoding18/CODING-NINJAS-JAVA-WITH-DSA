/*
Print the following pattern
Pattern for N = 4


The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input :
5
Sample Output :


The dots represent spaces. */
import java.util.Scanner;
public class Solution{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
            int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int space=0;
            while(space<n-i)
            {
                System.out.print(" ");
                space=space+1;
            }
            int j = i;
            while(j<=2*i-1)
                
            {
                System.out.print(j);
                j=j+1;
            }
            System.out.println(" ");
            i=i+1;
        }
    }
}
