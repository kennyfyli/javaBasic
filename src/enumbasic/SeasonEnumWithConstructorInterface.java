package enumbasic;

public enum SeasonEnumWithConstructorInterface implements SeasonInterface {
	SPRING("sp"){
		public void info() {
			// unique
		}	
	}
	,
	SUMMER("su"){
		public void info() {
			// unique
		}	
	}
	, FALL("f"){
		public void info() {
			// unique
		}	
	}
	, WINTER("w"){
		public void info() {
			// unique
		}	
	};
	// public String name;
	private final String name;
	
	private SeasonEnumWithConstructorInterface(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	/* same function for all enum
	public void info() {
		// implement the info func from SeasonInterface
	}
	*/
	
	
	
}
