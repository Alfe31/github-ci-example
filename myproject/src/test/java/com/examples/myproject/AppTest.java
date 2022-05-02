package com.examples.myproject;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private App app;
	
	@Before
	public void setup() {
		app = new App();
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSayHello()
    {
        assertEquals( "Hello",app.sayHello(null) );
    }
    
    @Test
    public void testMain() {
    	App.main(null);
    }
}
