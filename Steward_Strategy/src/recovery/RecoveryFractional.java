/*
 * File: RecoveryFractional.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class is an implementation of the Recovery interface which heals by a set percentage of the current health each time CalculateRecovery is called
 */

package recovery;

public class RecoveryFractional implements RecoveryBehavior
{
	private double recoveryFraction;

	public RecoveryFractional(double frac)
	{
		recoveryFraction = frac;
	}

	@Override
	public int calculateRecovery(int currentLife, int maxLife)
	{
		// No recovery when the alien is dead
		if (currentLife == 0)
			return 0;

		// Calculate how many life points to recover
		double recoveredLifePoints = recoveryFraction * currentLife;

		// Then round up so we have a nice integer value to work with
		recoveredLifePoints = Math.ceil(recoveredLifePoints);
		currentLife += (int) recoveredLifePoints;

		// Make sure we can't heal past the maximum LifePoints
		if (currentLife > maxLife)
			currentLife = maxLife;

		return currentLife;
	}

}
