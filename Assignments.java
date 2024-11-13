package com.mycompany.assignments;

import java.util.Scanner;

public class Assignments extends Factorial {
    
    public static void main(String[] args) {
        System.out.println("This program calculate the factorial number");
        Scanner scan = new Scanner(System.in);
        Factorial f1=new Factorial();
        System.out.print("Enter the Number : ");
        int x= scan.nextInt();
        f1.setNum(x);
        System.out.println("The factorial of "+f1.getNum()+" = "+f1.getFactorial());
    }
}
