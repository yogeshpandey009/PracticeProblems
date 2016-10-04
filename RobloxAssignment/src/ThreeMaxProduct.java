import java.math.BigInteger;

public class ThreeMaxProduct {

	public static int solution(int[] input) {
		if (input == null || input.length < 3)
			throw new IllegalArgumentException("Invalid Input");

		//Max Product will either be product of top 3 maximum numbers
		//Or even Minimum 2 numbers can also produce max product
		//as product two negative will result positive

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int num : input) {
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}
			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2) {
				min2 = num;
			}
		}

		BigInteger product1 = new BigInteger(max1 + "").multiply(
				new BigInteger(max2 + "")).multiply(new BigInteger(max3 + ""));
		BigInteger product2 = new BigInteger(max1 + "").multiply(
				new BigInteger(min1 + "")).multiply(new BigInteger(min2 + ""));
		BigInteger result = product1.max(product2);
		// long product1 = (long)max1 * max2 * max3;
		// long product2 = (long)max1 * min1 * min2;
		// long result = product1 > product2 ? product1 : product2;
		if (result.compareTo(new BigInteger(Integer.MAX_VALUE + "")) == 1
				|| result.compareTo(new BigInteger(Integer.MIN_VALUE + "")) == -1) {
			throw new IllegalArgumentException("Product Overflow");
		}
		return result.intValue();
	}

}
