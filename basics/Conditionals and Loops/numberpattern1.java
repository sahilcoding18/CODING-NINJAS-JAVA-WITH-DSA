/*
Print the following pattern
Pattern for N = 4
1
23
345
4567
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
1
23
345
*/
import java.util.Scanner;
public class Solution{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
            int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
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
