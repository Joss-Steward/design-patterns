/*
 * Project: SWE 200, Lab 1
 * File: Environment.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class is a container which will contain a 2D array of cells.
 */

package environment;

import lifeform.*;

public class Environment
{
	private int xLimit; // This is the x dimension
	private int yLimit; // This is the y dimension

	private Cell[][] cells; // This 2D array will store all the cells

	/*
	 * In this constructor I create a 2D array with the dimensions specified by
	 * x and y, then iterate through the array and create a new cell for each
	 * point.
	 */
	public Environment(int x, int y)
	{
		// We store the maximum dimensions of the array for future reference.
		xLimit = x;
		yLimit = y;

		// Then we create the array
		cells = new Cell[x][y];

		// Now we initialize our cell array.
		for (int xi = 0; xi < xLimit; xi++)
		{
			for (int yi = 0; yi < yLimit; yi++)
			{
				// Storing a empty cell in each position.
				cells[xi][yi] = new Cell();
			}
		}
	}

	/*
	 * This will return the cell stored at x, y.
	 */
	private Cell getCell(int x, int y)
	{
		// Not sure if we're allowed to use exceptions yet,
		// so I'll just return null if the requested location
		// is outside the size of the array.
		if (!isWithinLimits(x, y))
			return null;

		return cells[x][y];
	}

	/*
	 * This will return true if the specified x & y position is valid & within
	 * the limits of the 2D array.
	 */
	private boolean isWithinLimits(int x, int y)
	{
		// If the x or y value exceed the size of our array, it is not within
		// limits
		if ((x >= xLimit) || (y >= yLimit))
		{
			return false;
		}

		// If the x or y value are lower than zero, it is not within limits
		if ((x < 0) || (y < 0))
		{
			return false;
		}

		return true;
	}

	/*
	 * This will store the passed life form in the cell at x, y.
	 */
	public boolean addLifeForm(int x, int y, LifeForm life)
	{
		// Fail if the position specified is outside the limits of the array.
		if (!isWithinLimits(x, y))
			return false;

		if (getCell(x, y).hasLifeForm())
			return false;

		return cells[x][y].addLifeForm(life);
	}

	/*
	 * This will return the LifeForm stored in the Cell at x, y or null if there
	 * is not LifeForm stored there.
	 */
	public LifeForm getLifeform(int x, int y)
	{
		if (!isWithinLimits(x, y))
			return null;

		return getCell(x, y).getLifeForm();
	}

	/*
	 * This will remove the LifeForm stored in the Cell at x, y and return true
	 * if successful or false if it was not successful (e.g. x or y was outside
	 * the limits of the array OR there was no LifeForm in that cell).
	 */
	public boolean removeLifeForm(int x, int y)
	{
		if (!isWithinLimits(x, y))
			return false;

		return getCell(x, y).removeLifeForm();
	}
}
