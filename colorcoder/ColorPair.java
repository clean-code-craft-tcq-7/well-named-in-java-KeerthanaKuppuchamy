package colorcoder;

public class ColorPair {

	private EMajorColors majorColor;
	private EMinorColors minorColor;

	public ColorPair(EMajorColors major, EMinorColors minor) {
		majorColor = major;
		minorColor = minor;
	}

	public EMajorColors getMajor() {
		return majorColor;
	}

	public EMinorColors getMinor() {
		return minorColor;
	}

	String ToString() {
		String colorPairStr = ColorCoder.MajorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += ColorCoder.MinorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}
}
