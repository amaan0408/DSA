package com.algorithmsPractice.random;

public class TCS {
    public int charges(int n){
        int sum=0;
        if(n<1) {
            return -1;
        }
        for(int i=1;i<=n;i++){
            if(i<=2){
                sum+=100;
            }
            else if(i>2&&i<6){
                sum+=50;
            }
            else if(i>5){
               sum+=20;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TCS tcs = new TCS();
        int result = tcs.charges(5);
        System.out.println(result);
    }
}
