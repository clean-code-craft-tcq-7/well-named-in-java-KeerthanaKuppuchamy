package colorcode;

public enum EMajorColors {
	
	WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

	private int index;

	private EMajorColors(int index) {
		this.index = index;
	}

	int getIndex() {
		return index;
	}

	public static EMajorColors fromIndex(int index) {
		for (EMajorColors color : EMajorColors.values()) {
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}
};
