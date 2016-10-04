public class MergeSorted {

	public static int[] solution(int[] input1, int[] input2) {
		if (input1 == null || input2 == null)
			return null;

		int len1 = input1.length;
		int i = 0;
		int len2 = input2.length;
		int j = 0;
		int[] result = new int[len1 + len2];
		int k = 0;
		//Pick smaller value from either two list
		while (i < len1 && j < len2) {
			if (input1[i] <= input2[j]) {
				result[k] = input1[i];
				i++;
			} else {
				result[k] = input2[j];
				j++;
			}
			k++;
		}
		//list2 reached end
		while (i < len1) {
			result[k] = input1[i];
			i++;
			k++;
		}
		//list1 reached end
		while (j < len2) {
			result[k] = input2[j];
			j++;
			k++;
		}

		return result;
	}

}
