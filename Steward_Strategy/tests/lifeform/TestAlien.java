/***
 * TestAlien - This class tests the Alien class
 * File: TestAlien.java
 * @author Joss Steward
 * 
 * An alien has lifePoints just like other lifeForms, but an alien
 * is capable of healing itself and recovering health as time goes on.
 */

package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import recovery.RecoveryLinear;
import recovery.RecoveryNone;

public class TestAlien
{

	@Test
	/**
	 * Test the simple constructor for Alien.
	 */
	public void testAlien()
	{
		// Create a new LifeForm to play with.
		Alien entity;

		entity = new Alien("Galapnigorp", 40);

		// Check that the name was set correctly.
		assertEquals("Galapnigorp", entity.getName());

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());
	}

	@Test
	/**
	 * Test the second constructor for Alien.
	 */
	public void testAliensSecondConstructor()
	{
		// Create a new LifeForm to play with.
		Alien entity;
		RecoveryNone rb = new RecoveryNone();

		entity = new Alien("Galapnigorp", 40, rb);

		// Check that the name was set correctly.
		assertEquals("Galapnigorp", entity.getName());

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());
	}

	@Test
	/**
	 * Tests that the Alien loses life points when hit.
	 */
	public void testTakeHit()
	{
		Alien entity;

		entity = new Alien("Galapnigorp", 40);

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());

		// Hurt the alien (cruel, ain't it?)
		entity.takeHit(10);

		// Check that the LifePoints were set correctly.
		assertEquals(30, entity.getCurrentLifePoints());
	}

	@Test
	/**
	 * Test Alien with the simplest form of recovery - linear.
	 */
	public void testRecoverWithRecoveryLinear()
	{
		Alien entity;
		RecoveryLinear rl = new RecoveryLinear(10);

		entity = new Alien("Galapnigorp", 40, rl);

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());

		// Hurt the alien (cruel, ain't it?)
		entity.takeHit(10);

		// Check that the LifePoints were set correctly.
		assertEquals(30, entity.getCurrentLifePoints());

		// Trigger a recovery
		entity.recover();

		// Check that the LifePoints were set correctly.
		assertEquals(40, entity.getCurrentLifePoints());
	}
}
