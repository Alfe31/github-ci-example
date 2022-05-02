package com.examples.myproject;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String MESSAGE_HELLO = "Hello";
	public String sayHello(String name) {
		if(name == null)
			return MESSAGE_HELLO;
		else
			return MESSAGE_HELLO+" "+ name;
	}
    public static void main( String[] args )
    {
    	App app = new App();
        System.out.println( app.sayHello(null) );
    }
}
