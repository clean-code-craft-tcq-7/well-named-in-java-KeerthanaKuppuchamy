package colorcoder;

public class ColorCoderTest {

	public static void testNumberToPair(int pairNumber, EMajorColors expectedMajor, EMinorColors expectedMinor) {
		ColorPair colorPair = ColorCoder.GetColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	public static void testPairToNumber(EMajorColors major, EMinorColors minor, int expectedPairNumber) {
		int pairNumber = ColorCoder.GetPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

}
