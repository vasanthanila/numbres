/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package armstr;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Armstr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=0;
       while(n>0)
       {
           int temp;
           temp=n%10;
           n=n/10;
           sum=sum+temp*temp*temp;
       }
           System.out.println(sum);
           
       System.out.println(sum+"is a armstrong number");
  
       
    }
}
