package colorcode;

public enum EMinorColors {
	
	BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);

	private int index;

	private EMinorColors(int index) {
		this.index = index;
	}

	int getIndex() {
		return index;
	}

	public static EMinorColors fromIndex(int index) {
		for (EMinorColors color : EMinorColors.values()) {
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}
};
