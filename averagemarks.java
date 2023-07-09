import java.util.*;
public class averagemarks {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        char name= Sc.next().charAt(0);
        char c ='A';
        int m1,m2,m3;
        m1=Sc.nextInt();
         m2=Sc.nextInt();
          m3=Sc.nextInt();
          int avg=(m1+m2+m3)/3;
          System.out.println(name);
          System.out.println(avg);

    }
    
}
