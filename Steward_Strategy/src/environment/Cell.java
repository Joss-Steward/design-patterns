/*
 * Project: SWE 200, Lab 1
 * File: Cell.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class is a container which can contain one LifeForm.
 */

package environment;

import lifeform.*;

public class Cell
{
	private LifeForm life;
	private boolean hasStoredLife;

	/*
	 * Creates the cell, initializes the stored life to null, and sets
	 * hasStoredLife to false.
	 */
	public Cell()
	{
		life = null;
		hasStoredLife = false;
	}

	/*
	 * Returns the stored LifeForm, if any.
	 */
	public LifeForm getLifeForm()
	{
		return life;
	}

	/*
	 * If there is no LifeForm already stored, this will store the LifeForm
	 * passed in and return true. Otherwise it will return null.
	 */
	public boolean addLifeForm(LifeForm entity)
	{
		if (hasStoredLife)
		{
			return false;
		} else
		{
			life = entity;
			hasStoredLife = true;
			return true;
		}
	}

	/*
	 * This will return true if there is already a stored LifeForm and false
	 * otherwise.
	 */
	public boolean hasLifeForm()
	{
		return hasStoredLife;
	}

	/*
	 * This will remove the stored LifeForm and return true. If there was no
	 * stored life it will return false.
	 */
	public boolean removeLifeForm()
	{
		if (!hasStoredLife)
			return false;

		life = null;
		hasStoredLife = false;

		return true;
	}
}
