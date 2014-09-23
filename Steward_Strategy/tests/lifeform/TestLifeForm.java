/*
 * Project: SWE 200, Lab 1
 * File: TestLifeForm.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class contains all the tests run on LifeForm.
 */

package lifeform;

import static org.junit.Assert.*;
import lifeform.LifeForm;

import org.junit.Test;

public class TestLifeForm
{
	@Test
	public void testInitialization()
	{
		// Create a new LifeForm to play with.
		LifeForm entity;

		entity = new MockLifeForm("Bob", 40);

		// Check that the name was set correctly.
		assertEquals("Bob", entity.getName());

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());
	}

	@Test
	public void testTakeHit()
	{// Create a new LifeForm to play with.
		LifeForm entity;

		entity = new MockLifeForm("Bob", 40);

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());

		entity.takeHit(10);

		// Check that the LifePoints were set correctly.
		assertEquals(30, entity.getCurrentLifePoints());
	}
}
