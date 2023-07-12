/*Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
22
333
4444
55555
Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666 */
import java.util.*;
public class triangularnumberpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int r=1;
        while(r<=n){
            int c=1;
            while(c<=r){
                System.out.print(r);
                c+=1;
            }
            System.out.println();
            r+=1;
        }
    }
    
}
