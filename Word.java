//Name: Li Hang Biao
//Lab: 11A

public class Word {
	// instance variable
	protected String word;

	public Word(String w) { // passing word to here
		try {
			// check if word is doesn't have number or other char
			if (wordCheck(w)) {
				this.word = w;
			} // of not then throw a exception
			else if (!wordCheck(w)) {
				this.word = w; //keep the word to avoid error
				throw new IllegalWordException(w);
			}

		} // Try
		catch (IllegalWordException d) {
			// JOptionPane.showMessageDialog(null, "Not a valid Word" + d + "\n");
			System.out.println("Not A Valid word: " + d + '\n');
		} // Catch
	}

	@Override
	public String toString() {
		return word; // return back the word
	}

	public int compareTo(Word w) { // compare new word from the previous word
		return this.word.compareTo(w.word);
	}

	public String getWord() {
		return word; // return back the word
	}

	// Regular Expression to check if a word is fully letter
	public static boolean wordCheck(String s) {
		return s.matches("[a-zA-Z]+");
	}

}