/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.summativesums;

/**
 *
 * @author Nur
 */
public class StatM {
  public static void main(String[] args){
    int [] Numberlist1={ 1, 90, -33, -55, 67, -16, 28, -55, 15 }; 
   int [] Numberlist2={  999, -60, -77, 14, 160, 301 }; 
   int [] Numberlist3={  10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 }; 
   System.out.println("#1 Array sum:" + add(Numberlist1));
   System.out.println("#2 Array sum:" + add(Numberlist2));
   System.out.println("#3 Array sum:" + add(Numberlist3));
  }
public static int add(int[] list){
int sum=0;
for (int i:list) {
    sum+=i;
}
return sum;
}
}
