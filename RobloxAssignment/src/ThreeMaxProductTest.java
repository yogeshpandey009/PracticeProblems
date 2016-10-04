import org.junit.Assert;
import org.junit.Test;

public class ThreeMaxProductTest {

	@Test
	public void testWithPostiveMax() {
		int output = ThreeMaxProduct.solution(new int[] { 10, 3, 0, -2, 12, 5,
				1, 1, 4 });
		Assert.assertEquals(600, output);
	}

	@Test
	public void testWithNegativeMax() {
		int output = ThreeMaxProduct.solution(new int[] { -10, 10, -2, -12, 5,
				0, 3, 3 });
		Assert.assertEquals(1200, output);
	}

	@Test
	public void testOddNegatives() {
		int output = ThreeMaxProduct.solution(new int[] { -10, -2, -12, -5, -3,
				-2 });
		Assert.assertEquals(-12, output);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaxOverflow() {
		ThreeMaxProduct.solution(new int[] { Integer.MAX_VALUE, 2,
				Integer.MAX_VALUE, 5, Integer.MAX_VALUE, -2 });
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMinOverflow() {
		ThreeMaxProduct.solution(new int[] { Integer.MIN_VALUE,
				Integer.MIN_VALUE, Integer.MIN_VALUE });
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidInput() {
		ThreeMaxProduct.solution(new int[] { 3, -2 });
	}

}
