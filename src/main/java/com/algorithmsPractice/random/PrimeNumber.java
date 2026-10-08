package com.algorithmsPractice.random;

public class PrimeNumber {
    public int find(String str){
      int count=0;
      for(int i=0;i<str.length();i++){
          if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
             count++;
          }
      }
      return count;
    }
    public  static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        String str = "antdibn*&^%";
        System.out.println(    p.find(str));
    }
}
