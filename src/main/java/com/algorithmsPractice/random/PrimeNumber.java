package com.algorithmsPractice.random;

import static javax.print.attribute.standard.MediaSizeName.A;

public class PrimeNumber {
    public boolean find(String str){

      str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=str.length()-1;
      while(i<j){
          if(str.charAt(i)!=str.charAt(j)){
              return false;
          }
          i++;
          j--;
      }
      return true;
    }
    public  static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        String str = "A man, a plan, a canal: Panama";
        System.out.println(p.find(str));
    }
}
