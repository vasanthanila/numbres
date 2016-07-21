/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package del;

/**
 *
 * @author Student
 */
public class Del {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num={2,4,6,3,5};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.println(num[i]);
        }
    
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
        
        for(int i=n;2<n;n--)
        {}
        for(int i=0;i<n;i++){
            System.out.print(""+num[i]);
        }
            
    }
}

      
    

