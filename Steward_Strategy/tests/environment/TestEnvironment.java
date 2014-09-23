/*
 * Project: SWE 200, Lab 1
 * File: TestEnvironment.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class contains all the tests for environment.
 */

package environment;

import static org.junit.Assert.*;
import lifeform.MockLifeForm;
import environment.Environment;
import lifeform.LifeForm;

import org.junit.Test;

public class TestEnvironment
{
	/*
	 * This test will make sure the constructor for Environment works properly.
	 */
	@Test
	public void testInitialization()
	{
		Environment envir = new Environment(1, 1);

		// The Cell at position (0,0) should not contain a LifeForm.
		assertNull(envir.getLifeform(0, 0));
	}

	/*
	 * This test will ensure that addLifeForm works correctly.
	 */
	@Test
	public void testAddLifeForm()
	{
		// Create a new environment
		Environment envir = new Environment(2, 3);

		// Create two LifeForms to work with - bob and alice.
		LifeForm bob = new MockLifeForm("Bob", 40);
		LifeForm alice = new MockLifeForm("Alice", 40);

		// Add bob at (1,2)
		boolean success = envir.addLifeForm(1, 2, bob);

		// (1,2) should not contain a LifeForm, so this
		// should succeed without issue.
		assertTrue(success);
		assertEquals(bob, envir.getLifeform(1, 2));

		// Now try to add alice to the same location.
		// This should fail because there is already a
		// LifeForm in this Cell.
		success = envir.addLifeForm(1, 2, alice);

		// The addLifeForm should have failed.
		assertFalse(success);
		assertEquals(bob, envir.getLifeform(1, 2));
	}

	/*
	 * This will test that RemoveLifeForm is working properly.
	 */
	@Test
	public void testRemoveLifeForm()
	{
		// Create a new Environment to play with.
		Environment envir = new Environment(2, 3);

		// Create a new LifeForm to test.
		LifeForm bob = new MockLifeForm("Bob", 40);

		// Add the LifeForm to the Environment at (1,2)
		boolean success = envir.addLifeForm(1, 2, bob);

		// This should succeed.
		assertTrue(success);
		assertEquals(bob, envir.getLifeform(1, 2));

		// Remove the LifeForm at (1,2)
		envir.removeLifeForm(1, 2);

		// Now the LifeForm at (1,2) should be null.
		assertNull(envir.getLifeform(1, 2));
	}

	/*
	 * This test will ensure that addLifeForm works correctly even for the
	 * border cases
	 */
	@Test
	public void testAddLifeFormBorderCases()
	{
		// Create a new environment
		Environment envir = new Environment(40, 30);

		// Create a LifeForm to work with
		LifeForm bob = new MockLifeForm("Bob", 40);

		// Add bob at (0,0)
		boolean success = envir.addLifeForm(0, 0, bob);

		// (0,0) should not contain a LifeForm, so this
		// should succeed without issue.
		assertTrue(success);
		assertEquals(bob, envir.getLifeform(0, 0));

		// Add bob at (39,29)
		success = envir.addLifeForm(39, 29, bob);

		// (39,29) should not contain a LifeForm, so this
		// should succeed without issue.
		assertTrue(success);
		assertEquals(bob, envir.getLifeform(39, 29));
	}
}
