import java.util.*;
public class squarepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int r=1;
        while(r<=n){
            int c =1;
            while(c<=n){
                System.out.print(n);
                c+=1;
            }
            System.out.println();
            r+=1;
        }
    }
    
}
