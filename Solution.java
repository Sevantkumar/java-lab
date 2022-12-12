/*import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int res[]=new int[n];
        System.out.println("Enter the elements");
        String S=sc.nextLine();
        String[] N=S.split(" ");
        int[] ar=new int[n];
        int i=-1;
        for(String j:N)
            ar[i++] = Integer.parseInt(j);
        System.out.println("Enter the number of quries");
        int q=sc.nextInt();
        System.out.println("Enter the quary");
        String s=sc.nextLine();
        if(s=="Insert"){
            System.out.println("Enter the index and value");
            String X=sc.nextLine();
            String x[]=X.split(" ");
            int I[]=new int[q];
            i=-1;
            for(String j:x)
                I[i++]=Integer.parseInt(j);
            for(i=0;i<n;i++){
                if(i==I[0])
                    ar[i]=I[1];
            }    
        }
        String s2=sc.nextLine();
        if(s2=="Delete"){
            System.out.println("Enter the index to delete");
            int x=sc.nextInt();
            
            int j=0;
            for(i=0;i<n;i++){
                if(i==x)
                    continue;
                else{
                    res[j]=ar[i];
                    j++;
                }
            }
        }  
        sc.close();
        System.out.println("The updated list");
        for(int k:res)  
            System.out.println(k);
    }
}
