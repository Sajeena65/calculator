/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("Enter first number:");
        int x=input.nextInt();
        System.out.println("Enter second number:");
        int y=input.nextInt();
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Div");
        System.out.println("4.Mul");
        System.out.println("5.Min");
        System.out.println("6.Max");
        System.out.println("7.Power");
        System.out.println("8.Exit");
        System.out.println("Enter your choice [1-8]");
        int choice=input.nextInt();
        int total=0;
        
        switch(choice){
            case 1:
                total=x+y;
                break;
            case 2:
                total=x-y;
                break;
            case 3:
                total=x/y;
                break;
            case 4:
                total=x*y;
                break;
            case 5:
                total=(x<y)?x:y;
                break;
            case 6:
                total=(x>y)?x:y;
                break;
            case 7:
                total=(int) Math.pow(x,y);
                break;
            case 8:
                    System.exit(0);
                break;
            
            
         
        }
        System.out.println("Total is "+ total);
        
        System.out.println("Do you want to continue [Y/N]?");
        String ch=input.next();
        if(ch.equalsIgnoreCase("n")){
            System.exit(0);
            
        }
        }
    }
    
}
