/**
 * 
 */
package net.luisalbertogh.sdlc.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import net.luisalbertogh.sdlc.FooClass;

/**
 * @author loga
 *
 */
public class SdlcTest {

	/**
	 * Test method for {@link net.luisalbertogh.sdlc.FooClass#sum(int, int)}.
	 */
	@Test
	public void testSum() {
		FooClass fc = new FooClass();
		assertEquals("It is 5!", 5, fc.sum(2, 3));
	}

}
