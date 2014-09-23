/*
 * Project: SWE 200, Lab 1
 * File: AllGameTests.java
 * Author: Joss Steward (js0289@cs.ship.edu)
 * Description:
 *	This class runs all the tests for this lab.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import environment.*;
import lifeform.*;
import recovery.*;

/*
 * This imports the classes which contain all the other tests.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestLifeForm.class, TestCell.class,
		TestEnvironment.class, TestHuman.class, TestAlien.class,
		TestRecoveryNone.class, TestRecoveryLinear.class,
		TestRecoveryFractional.class })
public class AllGameTests
{
	public void test()
	{
	}
}
