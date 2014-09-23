/*
 * File: TestCell.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class tests the cell class.
 */

package environment;

import static org.junit.Assert.*;
import lifeform.MockLifeForm;
import environment.Cell;
import lifeform.LifeForm;

import org.junit.Test;

public class TestCell
{
	/*
	 * This test will ensure the constructor of Cell works properly.
	 */
	@Test
	public void testInitialization()
	{
		Cell cell = new Cell();

		// The new Cell should not contain a LifeForm.
		assertNull(cell.getLifeForm());
	}

	/*
	 * This test will ensure that addLifeForm and getLifeForm are working
	 * properly.
	 */
	@Test
	public void testSetLifeForm()
	{
		// Create two LifeForms - bob & fred
		LifeForm bob = new MockLifeForm("Bob", 40);
		LifeForm fred = new MockLifeForm("Fred", 40);

		// Create a new Cell to test.
		Cell cell = new Cell();
		boolean success = false;

		// Here we'll add bob to Cell and return true.
		success = cell.addLifeForm(bob);

		assertTrue(success);
		assertEquals(bob, cell.getLifeForm());

		// Now we'll try to add fred to a cell which already
		// contains a LifeForm - this should fail and return
		// false.
		success = cell.addLifeForm(fred);

		assertFalse(success);
		assertEquals(bob, cell.getLifeForm());
	}
}
