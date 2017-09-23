package ui;

import java.util.Scanner;

import ui.DsChooser;
import ui.UiChoiceText;

import model.*;

public class Ui {
	
	public void intromsg() {
		Scanner ds_choice = new Scanner(System.in);		
		UiChoiceText uichoicetext = new UiChoiceText();
		
		uichoicetext.ChoiceMsg();
		
		String choice = ds_choice.next();
		
		try {
			int first_choice = Integer.parseInt(choice);
			DsChooser dschooser = new DsChooser();
			String dschosen = dschooser.dsSwitcher(first_choice);
			
			System.out.println("You chose " + first_choice +". " + dschosen);
			Array array = new Array();
			array.welcomeMsg();

		}
		catch (NumberFormatException e) {
			checkStringChoice(choice);
			 
		}
		ds_choice.close();
	}		

	private void checkStringChoice(String StringChoice) {
		if (StringChoice.equals("x")) {
			System.out.println("Fine I am closing it! Run me again later!");
		}
		else {
			System.out.println("Come on man choose or leave! *Rolls Eyes*");
			intromsg();
		}
	}
}
