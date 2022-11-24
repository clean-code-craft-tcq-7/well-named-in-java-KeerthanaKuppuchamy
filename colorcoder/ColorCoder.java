package colorcoder;

public class ColorCoder {

	public final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
	public final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	public final static int numberOfMajorColors = MajorColorNames.length;
	public final static int numberOfMinorColors = MinorColorNames.length;

	public static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		EMajorColors majorColor = EMajorColors.fromIndex(zeroBasedPairNumber / numberOfMajorColors);
		EMinorColors minorColor = EMinorColors.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	public static int GetPairNumberFromColor(EMajorColors major, EMinorColors minor) {
		return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}

	public static void printColorsAndPairNumber() {
		for (int i = 1; i <= 25; i++) {
			System.out.println("Pair Number: " + i + " - Color: " + GetColorFromPairNumber(i).ToString());
		}
	}
}
