package com.threads;

public class Main{
  public static void main(String[] args){
    System.out.println("Hello there from main thread");

    Thread anotherThread = new AnotherThread();
    anotherThread.start();
  }
}