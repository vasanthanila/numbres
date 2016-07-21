/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sor;

/**
 *
 * @author Student
 */
public class Sor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num={5,4,6,2,3};
        int n=num.length;
    
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(num[i]>num[j])
                {
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        
        for(int i=0;i<2;i++)
        {
            System.out.print(""+num[i]);
        }
            
    }
}
