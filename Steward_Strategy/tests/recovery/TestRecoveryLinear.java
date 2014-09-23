/*
 * Project: SWE 200, Lab 1
 * File: TestRecoveryLinear.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class tests the RecoveryLinear Class
 */

package recovery;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecoveryLinear
{

	@Test
	public void testCalculateRecoveryWhenHealthIsFull()
	{
		RecoveryLinear linear = new RecoveryLinear(10);

		// Test when health is full
		assertEquals(50, linear.calculateRecovery(50, 50));
	}

	@Test
	public void testCalculateRecoveryWhenHealthIsMoreThan1StepAway()
	{
		RecoveryLinear linear = new RecoveryLinear(10);

		// Test when health is more than one step away
		assertEquals(40, linear.calculateRecovery(30, 50));
	}

	@Test
	public void testCalculateRecoveryWhenHealthIsLessThan1StepAway()
	{
		RecoveryLinear linear = new RecoveryLinear(10);

		// Make sure the health doesn't go over 50
		assertEquals(50, linear.calculateRecovery(45, 50));
	}

	@Test
	public void testCalculateRecoveryWhenDead()
	{
		RecoveryLinear linear = new RecoveryLinear(10);

		// Make sure the health doesn't increase when the alien is dead
		assertEquals(0, linear.calculateRecovery(0, 50));
	}

}
