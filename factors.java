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

    

    

