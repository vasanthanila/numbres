/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stri;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class STRI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        char a;
        String s2=" ";
        for(int i=0;i<l;i++)
        {
            a=s.charAt(i);
            if(a!=' ')
            {
             s2=s2+a;
             s=s.replace(a,' ');
             
            }
        }
        System.out.println(s2);
        
    }
}
