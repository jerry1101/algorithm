package BinarySearch;

public class Bclient {

	private static int[] list = new int[] { 10, 20, 30, 40, 50, 60, 70 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLocation(list, 60));

	}

	private static int getLocation(int[] list, int target) {
		int lowIndex = 0;
		int UpperIndex = list.length - 1;
		int guess = GetGuessIndex(lowIndex, UpperIndex);

		if (list.length < 2)
			return 0;
		while (1 == 1)
		{
			if (list[guess] == target) {
				return guess;
			} else if (list[guess] > target) {
				UpperIndex = guess;
			} else {
				lowIndex = guess;
			}
			guess = GetGuessIndex(lowIndex, UpperIndex);
		}

	}

	private static int GetGuessIndex(int lowIndex, int UpperIndex) {
		return UpperIndex % 2 == 0 ? (lowIndex + UpperIndex) / 2 : (lowIndex + UpperIndex + 1) / 2;
	}

}
