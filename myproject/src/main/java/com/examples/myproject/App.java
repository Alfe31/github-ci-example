package com.examples.myproject;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String MESSAGE_HELLO = "Hello";
	public String sayHello() {
		return MESSAGE_HELLO;
	}
    public static void main( String[] args )
    {
    	App app = new App();
        System.out.println( app.sayHello() );
    }
}
