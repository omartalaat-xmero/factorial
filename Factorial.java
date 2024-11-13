package com.mycompany.assignments;

public class Factorial {
    
    private int num;
    private int i;
    private int factorial;
    
    public void setNum(int n) {
        num = n;
    }
    
    public int getNum() {
        return num;
    }
    
    public int getFactorial() {
        for( i=0;i<=num;i++){
            if (i==0){
                factorial=1;
            }
            else
                factorial*=i;
            }
        return factorial;
    }
}
