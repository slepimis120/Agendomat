package agendomat.generator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import agendomat.Agenda;

public class GenerateAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
	    if (selections.isEmpty()) return;
	    EObject first = selections.iterator().next();
	    
	    if (first instanceof DSemanticDiagram diagram) {
	        EObject semantic = diagram.getTarget();
	        if (semantic instanceof Agenda agenda) {
	            try {
	                AgendaGenerator generator = new AgendaGenerator();
	                String html = generator.generateHtml(agenda).toString();
	                IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("agendomat.generator");
	                File resultDir = new File(project.getLocation().toOSString() + "/result");
                	resultDir.mkdirs();
                	String fileName = agenda.getAgendaName().replaceAll("[^a-zA-Z0-9]", "_") + ".html";
                	Files.writeString(Path.of(resultDir.getAbsolutePath() + "/" + fileName), html);
                	System.out.println("Generisan: " + resultDir.getAbsolutePath() + "/" + fileName);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return true;
    }
}
