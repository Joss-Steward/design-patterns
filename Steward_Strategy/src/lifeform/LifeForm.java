/**
 * Project: SWE 200, Lab 1
 * File: LifeForm.java
 * @author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class represent a simple LifeForm which has HitPoints and a Name.
 */

package lifeform;

public abstract class LifeForm
{
	protected String myName; // Stores the name of this instance
	protected int currentLifePoints; // Stores the current health of this
										// instance.
	protected int maxLifePoints;

	/**
	 * Creates a LifeForm and initializes myName and currentLifePoints.
	 */
	public LifeForm(String name, int points)
	{
		myName = name;
		currentLifePoints = points;
		maxLifePoints = points;
	}

	/**
	 * Returns the name of this instance.
	 */
	public String getName()
	{
		return myName;
	}

	/**
	 * Returns the current health of this instance.
	 */
	public int getCurrentLifePoints()
	{
		return currentLifePoints;
	}

	/**
	 * This abstract method handles taking damage. It will be implemented in
	 * each child class.
	 * 
	 * @param damage
	 */
	public abstract void takeHit(int damage);
}
