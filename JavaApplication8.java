/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch1=s.toCharArray();
        int j=s.length();
        for(int i=0;i<j;i++)
        {
            if(ch1[i]!=ch1[j-1])
            {
                System.out.print(ch1[i]+" "+ch1[(j-1)-i]+" "); 
            }
        }
        
    }
}
