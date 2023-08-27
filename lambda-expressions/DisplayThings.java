package com.lambda;

public class DisplayThings{

  public static void displayDashes(int number){
    System.out.println("-", repeat(number));
  }

  public static void sysOut(String s){ System.out.println(s); }
  public static void sysOut(int s){ System.out.println(s); }
  public static void sysOut(char s){ System.out.println(s); }
  public static void sysOut(boolean s){ System.out.println(s); }
  public static void sysOut<T>(T s){ System.out.println(s); }


}