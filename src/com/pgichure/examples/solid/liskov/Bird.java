/**
 * 
 */
package com.pgichure.examples.solid.liskov;

/**
 * @author Paul Gichure
 *
 */
public class Bird {

	
	public class FlyingBird extends Bird{ 
		
		public void fly() {
			System.out.println("I'm flying");
		}
	}
	
	public class Dove extends FlyingBird{}
	public class Penguin extends Bird{ }
	
}



