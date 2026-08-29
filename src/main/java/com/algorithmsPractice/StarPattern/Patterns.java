package com.algorithmsPractice.StarPattern;

public class Patterns {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
             for(int j=5; j>=i; j--){
                 System.out.print("*");
             }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
           for(int j=4; j>=i; j--){
               System.out.print(" ");
           }
           for(int k=1; k<=i; k++){
               System.out.print("*");
           }
            System.out.println();
        }




        //star
        for(int i=0; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            for(int r=2; r<=i; r++){
                System.out.print("*");
            }
            System.out.println();
        }



        //inverted pyramid
        for(int i=1; i<=5; i++){
            for(int j=2; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            for(int l=5; l>=i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
