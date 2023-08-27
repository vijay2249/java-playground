package com.threads;

import com.lambda.DisplayThings;

public class AnotherThread extends Thread{

  @Override
  public void run(){
    System.out.println("Hi there;")
    sysOut("Hello there from Another Thread");
  }
}