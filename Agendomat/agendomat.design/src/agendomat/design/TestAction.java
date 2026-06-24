package agendomat.design;

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class TestAction implements IExternalJavaAction {
    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        System.out.println("TestAction pokrenuta!");
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return true;
    }
}