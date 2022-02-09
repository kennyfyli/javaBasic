package enumbasic;

public enum SeasonEnumWithConstructor {
	SPRING("sp"), SUMMER("su"), FALL("f"), WINTER("w");
	// public String name;
	private final String name;
	
	private SeasonEnumWithConstructor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
