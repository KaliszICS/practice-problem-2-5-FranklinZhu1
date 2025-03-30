public class PracticeProblem {

	public static void insertionSort(char[] characters) {
		char key;
		int index;
		for (int i = 1; i < characters.length; ++i) {
			key = characters[i];
			index = i - 1;
			while (index >= 0 && characters[index] > key) {
				characters[index + 1] = characters[index--];
			}
			characters[index + 1] = key;
		}
	}

}
