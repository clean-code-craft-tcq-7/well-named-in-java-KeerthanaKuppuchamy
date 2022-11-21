package colorcode;

public class TwentyFivePairColorCode {

	final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
	final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	final static int numberOfMajorColors = MajorColorNames.length;
	final static int numberOfMinorColors = MinorColorNames.length;

	static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		EMajorColors majorColor = EMajorColors.fromIndex(zeroBasedPairNumber / numberOfMajorColors);
		EMinorColors minorColor = EMinorColors.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int GetPairNumberFromColor(EMajorColors major, EMinorColors minor) {
		return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}

	static void printColorsAndPairNumber() {
		for (int i = 1; i <= 25; i++) {
			System.out.println("Pair Number: " + i + " - Color: " + GetColorFromPairNumber(i).ToString());
		}
	}

	public static void main(String[] args) {
		printColorsAndPairNumber();
		TwentyFivePairColorCodeTest.testNumberToPair(4, EMajorColors.WHITE, EMinorColors.BROWN);
		TwentyFivePairColorCodeTest.testNumberToPair(5, EMajorColors.WHITE, EMinorColors.SLATE);

		TwentyFivePairColorCodeTest.testPairToNumber(EMajorColors.BLACK, EMinorColors.ORANGE, 12);
		TwentyFivePairColorCodeTest.testPairToNumber(EMajorColors.VIOLET, EMinorColors.SLATE, 25);
	}
}
