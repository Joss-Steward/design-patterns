package recovery;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecoveryFractional
{

	@Test
	public void testCalculateRecoveryWhenHealthIsFull()
	{
		// Make a fractional recovery that should heal 1/10 of the max each time
		RecoveryFractional fractional = new RecoveryFractional(0.1);

		// Test when health is full
		assertEquals(100, fractional.calculateRecovery(100, 100));
	}

	@Test
	public void testCalculateRecoveryWhenHealthIsMoreThan1StepAway()
	{
		// Make a fractional recovery that should heal 1/10 of the max each time
		RecoveryFractional fractional = new RecoveryFractional(0.1);

		// 10% of 80 is 8
		assertEquals(88, fractional.calculateRecovery(80, 100));

		// 10% of 88 is 8.8, then round up to 9
		assertEquals(97, fractional.calculateRecovery(88, 100));
	}

	@Test
	public void testCalculateRecoveryWhenHealthIsLessThan1StepAway()
	{
		// Make a fractional recovery that should heal 1/10 of the max each time
		RecoveryFractional fractional = new RecoveryFractional(0.1);

		assertEquals(100, fractional.calculateRecovery(95, 100));
	}

	@Test
	public void testCalculateRecoveryWhenDead()
	{
		// Make a fractional recovery that should heal 1/10 of the max each time
		RecoveryFractional fractional = new RecoveryFractional(0.1);

		// Test when no healing should occur
		assertEquals(0, fractional.calculateRecovery(0, 100));
	}

}
