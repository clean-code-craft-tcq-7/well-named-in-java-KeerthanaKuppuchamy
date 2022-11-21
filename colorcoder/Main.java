package colorcoder;

public class Main {

	public static void main(String[] args) {
		TwentyFivePairColorCode.printColorsAndPairNumber();
		TwentyFivePairColorCodeTest.testNumberToPair(4, EMajorColors.WHITE, EMinorColors.BROWN);
		TwentyFivePairColorCodeTest.testNumberToPair(5, EMajorColors.WHITE, EMinorColors.SLATE);

		TwentyFivePairColorCodeTest.testPairToNumber(EMajorColors.BLACK, EMinorColors.ORANGE, 12);
		TwentyFivePairColorCodeTest.testPairToNumber(EMajorColors.VIOLET, EMinorColors.SLATE, 25);
	}
}
