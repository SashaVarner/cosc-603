package travis_ci_tutorial_java;

import org.junit.Test;
import sun.java2d.pipe.SpanShapeRenderer;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}


	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(5,3),2);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(1,2), 2);
	}
}

