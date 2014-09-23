/*
 * File: RecoveryLinear.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class is an implementation of the Recovery interface which heals by a set amount each time CalculateRecovery is called
 */

package recovery;

public class RecoveryLinear implements RecoveryBehavior
{
	private int recoveryStep;

	public RecoveryLinear(int step)
	{
		recoveryStep = step;
	}

	@Override
	public int calculateRecovery(int currentLife, int maxLife)
	{
		// Don't heal at all if the currentLife is 0
		if (currentLife == 0)
			return 0;

		// If the currentLife is higher than 0, add the recoveryStep
		currentLife += recoveryStep;

		// If the new currentLife is greater than the maxLife, just set it
		// to maxLife
		if (currentLife > maxLife)
			currentLife = maxLife;

		// Return the new amount of life
		return currentLife;
	}

}
