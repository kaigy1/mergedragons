/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergedragons;

import java.util.*;

/**
 *
 * @author kaigy
 */


public class MergeDragons {

public static int sum;    
public static int[] tier;    
    /**
     * @param args the command line arguments
     */
    
    
public static void ripple3(int current)
    {
        int i;
        if(tier[current]>=3)
        {
            tier[current]-=3;
            tier[current+1]+=1;
        }
        else
        {
            System.out.println("ripple3 error\n");
        }
        
        return ;    
        
    }

    public static void ripple5(int current)
    {
        int i;
        if(tier[current]>=5)
        {
            tier[current]-=5;
            tier[current+1]+=2;
        }
        else
        {
            System.out.println("ripple5 error\n");
        
        }
        
        return;    
        
    }
    public static void solve(int aim)
    {
        int current;
        int flagRipple;
        while(tier[aim]==0)
        {
            current=0;
            flagRipple=0;
            while(flagRipple==0)
            {
                flagRipple=1;
                if(tier[aim-1]>=3)
                {
                    ripple3(aim-1);
                    return;
                }
                if(tier[current]>=5)
                {
                    ripple5(current);
                    current+=1;
                    flagRipple=0;
                    
                }
                
            }
          
            sum+=5;
            tier[0]+=5;
            
        
        }
        
       
    }
    
    
    public static void main(String[] args) {
        
        int ripples;
        
        
        System.out.println("Please input the order of the monument\n");
        
        Scanner sc = new Scanner(System.in);
        ripples=sc.nextInt();
        
        tier=new int[ripples+1];
        if(ripples<2)
        {
            System.out.println("1");
            return;
        }
        solve(ripples-1);
        
        
        
        System.out.println(sum);
        
        
        for(int i=0;i<ripples;i++)
        {
           System.out.print(tier[i]+"|");
        }
        
        
    }
    
}
