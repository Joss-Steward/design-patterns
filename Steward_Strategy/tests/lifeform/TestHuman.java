/***
 * TestHuman - This class contains the tests for the Human lifeform
 * File: TestHuman.java
 * @author Joss Steward
 */

package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHuman
{

	@Test
	public void testInitialization()
	{
		// Create a new human with 40 lifepoints and 15 armor points
		Human entity = new Human("Bob", 40, 15);

		// Check that the name was set correctly.
		assertEquals("Bob", entity.getName());

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());

		// Check that the amount of armor was set correctly.
		assertEquals(15, entity.getArmorPoints());
	}

	@Test
	public void testTakeHit()
	{
		// Create a new human with 40 lifepoints and 15 armor points
		Human entity = new Human("Bob", 40, 15);

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());

		// Hit it with a simple attack
		entity.takeHit(10);

		// Check that the LifePoints were set correctly.
		assertEquals(30, entity.getCurrentLifePoints());
	}

	@Test
	public void testTakeReallyBadHit()
	{
		// Create a new human with 40 lifepoints and 15 armor points
		Human entity = new Human("Bob", 40, 15);

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());

		// Hit it with a powerful attack
		entity.takeHit(50);

		// Check that the LifePoints were set correctly.
		assertEquals(0, entity.getCurrentLifePoints());
	}

	@Test
	public void testSetArmorPoints()
	{
		// Create a new human with 40 lifepoints and 15 armor points
		Human entity = new Human("Bob", 40, 15);

		// Check that the amount of armor was set correctly.
		assertEquals(15, entity.getArmorPoints());

		entity.setArmorPoints(50);

		// Check that the amount of armor was set correctly.
		assertEquals(50, entity.getArmorPoints());
	}
}
