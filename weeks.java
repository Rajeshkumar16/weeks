
package javaapplication3;

import java.util.Scanner;


public class JavaApplication3 {


    public static void main(String[] args) {
                String s;
                System.out.println("enter the working day");
                Scanner scr=new Scanner(System.in);
                s=scr.nextLine();
                if(s.equals("monday")||s.equals("tuesday")||s.contains("wednesday")||s.equals("thursday")||(s.equals("friday")))
                    System.out.println("true");
                else
                {
                    System.out.println("false");
                }
                
    }
    
}
