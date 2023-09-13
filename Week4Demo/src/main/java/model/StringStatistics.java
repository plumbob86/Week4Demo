/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Sep 13, 2023
 */
package model;

/**
 * @author lscha
 *
 */
public class StringStatistics {
	private String reversed = "";
	private int whiteSpaces = 0;
	private int vowels = 0;
	private int punctuation = 0;

	public StringStatistics(String string) {
		genStats(string.toLowerCase());
	}

	/**
	 * @param string
	 */
	private void genStats(String string) {
		for (int i = 0; i < string.length(); i++) {
			String analysisChar = string.substring(i, i + 1);
			if (analysisChar.contains(" ")) {
				whiteSpaces++;
			} else if (analysisChar.contains("a") || analysisChar.contains("e") || analysisChar.contains("i")
					|| analysisChar.contains("o") || analysisChar.contains("u") || analysisChar.contains("y")) {
				vowels++;
			} else if (analysisChar.contains(".") || analysisChar.contains("'") || analysisChar.contains(",")
					|| analysisChar.contains("?") || analysisChar.contains("!")) {
				punctuation++;
			}
		}

	}

	public String getReversed() {
		return reversed;
	}

	public void setReversed(String reversed) {
		this.reversed = reversed;
	}

	public int getWhiteSpaces() {
		return whiteSpaces;
	}

	public void setWhiteSpaces(int whiteSpaces) {
		this.whiteSpaces = whiteSpaces;
	}

	public int getVowels() {
		return vowels;
	}

	public void setVowels(int vowels) {
		this.vowels = vowels;
	}

	public int getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(int punctuation) {
		this.punctuation = punctuation;
	}

}
