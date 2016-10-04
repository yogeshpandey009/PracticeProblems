import org.junit.Assert;
import org.junit.Test;

public class MergeSortedTest {

	@Test
	public void testNormal() {
		int[] output = MergeSorted.solution(new int[] { 0, 2, 3 }, new int[] {
				1, 3, 4, 5 });
		Assert.assertArrayEquals(new int[] { 0, 1, 2, 3, 3, 4, 5 }, output);
	}

	@Test
	public void testNormal2() {
		int[] output = MergeSorted.solution(new int[] { 0, 2, 3, 3 },
				new int[] { 1, 3, 4 });
		Assert.assertArrayEquals(new int[] { 0, 1, 2, 3, 3, 3, 4 }, output);
	}

	@Test
	public void testInput1Empty() {
		int[] output = MergeSorted.solution(new int[] {}, new int[] { -1, 3, 3,
				4, 5 });
		Assert.assertArrayEquals(new int[] { -1, 3, 3, 4, 5 }, output);
	}

	@Test
	public void testInput2Empty() {
		int[] output = MergeSorted.solution(new int[] { -3, 1, 5, 5 },
				new int[] {});
		Assert.assertArrayEquals(new int[] { -3, 1, 5, 5 }, output);
	}

	@Test
	public void testBothEmpty() {
		int[] output = MergeSorted.solution(new int[] {}, new int[] {});
		Assert.assertArrayEquals(new int[] {}, output);
	}
}
