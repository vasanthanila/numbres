import java.util.*;
import java.util.Arrays;
public class World{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int j=s.nextInt();
        int ar[]=new int[j];
        for(int i=0;i<j;i++)
            ar[i]=s.nextInt();
        Arrays.sort(ar);
        String num="";
        for(int i=j-1;i>=0;i--)
            num=num+Integer.toString(ar[i]);
        System.out.println(num);
     }
}