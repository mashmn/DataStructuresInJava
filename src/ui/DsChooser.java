package ui;

public class DsChooser {
	
	String StringOfChoice;
	
	public String dsSwitcher(int firstChoice) {
		switch (firstChoice) {
			case 1:  StringOfChoice = "Arrays";
				break;
			case 2: StringOfChoice = "Linked List";
				break;
			case 3: StringOfChoice = "Stack";
				break;
			case 4: StringOfChoice = "Queue";
				break;
			default:
				break;
		}
		return StringOfChoice;
	}
}
