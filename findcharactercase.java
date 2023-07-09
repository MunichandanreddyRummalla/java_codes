import java.util.*;
public class findcharactercase {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        char ch =Sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(1);
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(0);
        }
        else
        {System.out.println(-1);}


    }
    
}
