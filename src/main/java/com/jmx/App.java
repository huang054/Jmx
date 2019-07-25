package com.jmx;

import com.jmx.mbean.Hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Hello mbean = new Hello();
        System.out.println( "Hello World!" );
        Thread.sleep(Integer.MAX_VALUE);
    }
}
