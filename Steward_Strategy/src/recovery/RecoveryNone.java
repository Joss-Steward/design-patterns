/*
 * Project: SWE 200, Lab 1
 * File: RecoveryNone.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class is an implementation of the Recovery interface which does not heal at all.
 */

package recovery;

public class RecoveryNone implements RecoveryBehavior
{

	@Override
	public int calculateRecovery(int currentLife, int maxLife)
	{
		return currentLife;
	}

}
