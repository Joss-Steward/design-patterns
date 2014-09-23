/*
 * Project: SWE 200, Lab 1
 * File: TestRecoveryNone.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class tests the RecoveryNone class
 */

package recovery;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecoveryNone
{

	@Test
	public void testCalculateRecoveryWhenHealthIsFull()
	{
		RecoveryNone recoveryNone = new RecoveryNone();

		// Test when health is full
		assertEquals(50, recoveryNone.calculateRecovery(50, 50));
	}

	@Test
	public void testCalculateRecoveryWhenHealthIsHalf()
	{
		RecoveryNone recoveryNone = new RecoveryNone();

		// Test when health is at half
		assertEquals(25, recoveryNone.calculateRecovery(25, 50));
	}

	@Test
	public void testCalculateRecoveryWhenDed()
	{
		RecoveryNone recoveryNone = new RecoveryNone();

		// Test when ded
		assertEquals(0, recoveryNone.calculateRecovery(0, 50));
	}

}
