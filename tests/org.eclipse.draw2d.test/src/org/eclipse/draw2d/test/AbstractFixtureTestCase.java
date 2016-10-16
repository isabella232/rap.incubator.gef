package org.eclipse.draw2d.test;

import org.eclipse.rap.rwt.testfixture.internal.Fixture;
import org.eclipse.swt.widgets.Display;

import junit.framework.TestCase;

public abstract class AbstractFixtureTestCase extends TestCase {

	protected Display display;

	public AbstractFixtureTestCase() {
		super();
	}

	public AbstractFixtureTestCase(String name) {
		super(name);
	}

	/**
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		Fixture.setUp(true);
		display = new Display();
	}

	/**
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		Fixture.tearDown();
	}

}
