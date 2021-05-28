package game;

public class Dialogue {
	public String speaker;
	public String sentence;
	
	public Dialogue(String speaker, String sentence) {
		this.speaker = speaker;
		this.sentence = sentence;
	}
	
	public String toString() {
		return speaker + ": " + sentence;
	}
}
