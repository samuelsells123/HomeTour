package game;

public class Person {
	protected String name;
	protected Dialogue[] conversation;
	
	public Person(String name, Dialogue[] conversation) {
		this.name = name;
		this.conversation = conversation;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//initiates conversation with person
	public void talk() {
		System.out.println();
		for(int i = 0; i < conversation.length; i++) {
			System.out.println(conversation[i].toString());
		}
		System.out.println();
	}
}
