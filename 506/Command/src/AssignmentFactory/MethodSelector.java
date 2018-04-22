package AssignmentFactory;

import java.util.HashMap;
import java.util.Map;

import AssignmentCommandSpliter.AddCommand;
import AssignmentCommandSpliter.RedoCommandMethod;
import AssignmentCommandSpliter.UndoCommandMethod;
import AssignmentInterfaces.ICommandProcedurerMethods;

public class MethodSelector {
	
	private Map<String, ICommandProcedurerMethods> methodContainer;
	
	public MethodSelector() {
		methodContainer = new HashMap<>();
		initiate();
	}

	private void initiate() {
		methodContainer.put("redo", new RedoCommandMethod());
		methodContainer.put("undo", new UndoCommandMethod());
		methodContainer.put("add", new AddCommand());
	}
	
	public ICommandProcedurerMethods getCommandMethod(int key) {
		return methodContainer.get(key);
	}
}
