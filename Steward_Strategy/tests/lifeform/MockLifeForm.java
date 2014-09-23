/*
 * Project: SWE 200, Lab 1
 * File: MockLifeForm.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class tests the lifeForm class by testing the MockLifeForm
 */

package lifeform;

public class MockLifeForm extends LifeForm
{
	public MockLifeForm(String name, int points)
	{
		super(name, points);
	}

	@Override
	public void takeHit(int damage)
	{
		currentLifePoints = currentLifePoints - damage;

		if (currentLifePoints < 0)
			currentLifePoints = 0;
	}
}
