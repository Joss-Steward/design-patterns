/***
 * Alien - This class extends LifeForm
 * File: Alien.java
 * @author Joss Steward
 * 
 * An alien has lifePoints just like other lifeForms, but an alien
 * is capable of healing itself and recovering health as time goes on.
 */

package lifeform;

import recovery.RecoveryBehavior;
import recovery.RecoveryNone;

public class Alien extends LifeForm
{
	/**
	 * recoveryBehavior stores a class which implements the RecoveryBehavior
	 * interface. The alien calls recoveryBehavior.calculateRecovery to
	 * determine how many lifePoints will be recovered.
	 */
	RecoveryBehavior recoveryBehavior;

	/**
	 * This constructor creates a new alien, and makes the assumption that the
	 * new alien should not be able to recover health.
	 * 
	 * @param name
	 *            - the name of the new alien
	 * @param points
	 *            - the maximum (and current) lifePoints of the new alien
	 */
	public Alien(String name, int points)
	{
		this(name, points, new RecoveryNone());
	}

	/**
	 * This constructor creates a new alien, recoveryBehavior is determined by
	 * whichever type of recoveryBehavior is passed in.
	 * 
	 * @param name
	 *            - the name of the new alien
	 * @param points
	 *            - the maximum (and current) lifePoints of the new alien
	 * @param rb
	 *            - the recoveryBehavior of the new alien
	 */
	public Alien(String name, int points, RecoveryBehavior rb)
	{
		super(name, points);
		recoveryBehavior = rb;
	}

	@Override
	/**
	 * The alien will take damage, reducing it's lifePoints by the amount of
	 * damage.  If the new value of lifePoints is less than 0, it will be
	 * set to 0.
	 */
	public void takeHit(int damage)
	{
		currentLifePoints = currentLifePoints - damage;

		if (currentLifePoints < 0)
			currentLifePoints = 0;
	}

	/**
	 * This causes the alien the recover health. How much health is recovered is
	 * dependent upon the specified recoveryBehavior.
	 */
	public void recover()
	{
		currentLifePoints = recoveryBehavior.calculateRecovery(
				currentLifePoints, maxLifePoints);
	}

	/**
	 * This method forces the currentLifePoints of this alien to whatever value
	 * is specified.
	 * 
	 * @param life
	 *            - the new amount of lifePoints
	 */
	public void setCurrentLifePoints(int life)
	{
		this.currentLifePoints = life;
	}
}
