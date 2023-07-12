/*Factors
Send Feedback
Write a program that takes a number as input and prints all its factors. If the number has only two factors (1 and the number itself), then the program should print -1.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Sample Input 2 :
11
Sample Output 2 :
-1
Explanation of Sample Output 2 :
11 is a prime number having factors 1 and 11 so that output will be -1. */
import java.util.*;
public class factors {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=2;
    boolean a=false; 
    while(i<=n/2){
        if(n%i==0){
            System.out.print(i);
            System.out.println(" ");
            a=true;
        }
        i++;
    }
        if(a==false){
            System.out.print("-1");
        }
    }
}

    

    

