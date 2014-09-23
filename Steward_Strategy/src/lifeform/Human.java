/***
 * Human - This class extends LifeForm
 * File: Human.java
 * @author Joss Steward
 * 
 * A human has lifepoints just like the other types of LifeForm,
 * but the human also has armor which reduces the damage done by
 * incoming attacks.
 */

package lifeform;

public class Human extends LifeForm
{
	/**
	 * Stores the amount of armor the Human currently has.
	 */
	private int armor;

	/**
	 * This simple constructor for human initializes the name, lifepoints, and
	 * armor strength to the values specified.
	 * 
	 * @param name
	 *            - The name of the new Human
	 * @param points
	 *            - The maximum (and current) health of the new Human
	 * @param armorStrength
	 *            - The amount of armor the new Human will be wearing
	 */
	public Human(String name, int points, int armorStrength)
	{
		super(name, points);
		armor = armorStrength;
	}

	@Override
	/**
	 * This overrides the base takeHit function to allow us to implement the damage
	 * reduction from the armor.
	 * 
	 * The armor has not yet been implemented.
	 */
	public void takeHit(int damage)
	{
		this.currentLifePoints = this.currentLifePoints - damage;

		// He's dead, Jim
		if (currentLifePoints < 0)
			currentLifePoints = 0;
	}

	/**
	 * @return - The current amount of armor the Human is wearing
	 */
	public int getArmorPoints()
	{
		return armor;
	}

	/**
	 * @param newArmor
	 *            - Set the current amount of armor to this value
	 */
	public void setArmorPoints(int newArmor)
	{
		armor = newArmor;
	}
}
