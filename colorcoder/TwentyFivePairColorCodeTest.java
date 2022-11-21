package colorcoder;

public class TwentyFivePairColorCodeTest {

	public static void testNumberToPair(int pairNumber, EMajorColors expectedMajor, EMinorColors expectedMinor) {
		ColorPair colorPair = TwentyFivePairColorCode.GetColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	public static void testPairToNumber(EMajorColors major, EMinorColors minor, int expectedPairNumber) {
		int pairNumber = TwentyFivePairColorCode.GetPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

}
