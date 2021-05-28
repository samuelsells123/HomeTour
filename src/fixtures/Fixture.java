package fixtures;

public abstract class Fixture {
	protected String name; // short name/title
	protected String shortDescription; // one-sentence description
	protected String longDescription; // paragraph-long description
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	// getter methods
	public String getName() {
		return name;
	}
	
	public String getShort() {
		return shortDescription;
	}
	
	public String getLong() {
		return longDescription;
	}
}
