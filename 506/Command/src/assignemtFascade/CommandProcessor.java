package assignemtFascade;

import java.util.ArrayList;
import java.util.Scanner;

import AssignmentFactory.MethodSelector;
import command.TransformCommand;
import receiver.ReceiverCircle;

public class CommandProcessor {
	
	private Scanner scanner;
	private MethodSelector methodSelector;
	private ArrayList<TransformCommand> allCommand;
	private ReceiverCircle circle;
	
	
	public CommandProcessor() {
		scanner = new Scanner(System.in);
		methodSelector = new MethodSelector();
		allCommand = new ArrayList<>();
		circle = new ReceiverCircle(0, 0);
	}
	
	
	public void proceed() {
		
		while(true) {
		
			System.out.print("Please Enter your command$: ");
			String command = scanner.nextLine();
			methodSelector.getCommandMethod(command).proceedCommand(allCommand, circle);
		}
		
	}
}
