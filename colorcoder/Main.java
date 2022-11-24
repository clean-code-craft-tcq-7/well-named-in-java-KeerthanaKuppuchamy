package colorcoder;

public class Main {

	public static void main(String[] args) {
		ColorCoder.printColorsAndPairNumber();
		ColorCoderTest.testNumberToPair(4, EMajorColors.WHITE, EMinorColors.BROWN);
		ColorCoderTest.testNumberToPair(5, EMajorColors.WHITE, EMinorColors.SLATE);

		ColorCoderTest.testPairToNumber(EMajorColors.BLACK, EMinorColors.ORANGE, 12);
		ColorCoderTest.testPairToNumber(EMajorColors.VIOLET, EMinorColors.SLATE, 25);
	}
}
