/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEAUTIFUL NEHA
 */
public class Pattern1
{
    void display()
    {
    for(int i=1;i<=4;i++)
        //This loop is for rows
    {
       //This loop is for column
        for(int j=1;j<=i;j++)
        {
           System.out.print(j);
        } 
        System.out.println();
    }
}
    public static void main(String args[])
    {
        Pattern1 p1=new Pattern1();
        p1.display();
    }
}
