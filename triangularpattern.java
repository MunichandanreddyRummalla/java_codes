/*Code : Triangular Star Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50 */
import java.util.Scanner;
public class triangularpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        while(r<=n){
            int c=1;
            while(c<=r){
            System.out.print("*");
            c+=1;
            }

        
        System.out.println();
        r+=1;
        }
    }
    
}
