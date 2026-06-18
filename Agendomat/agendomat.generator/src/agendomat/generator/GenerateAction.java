package agendomat.generator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import agendomat.Agenda;

public class GenerateAction implements IExternalJavaAction {

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        for (EObject obj : selections) {
            if (obj instanceof Agenda agenda) {
                try {
                    AgendaGenerator generator = new AgendaGenerator();
                    String html = generator.generateHtml(agenda).toString();
                    new File("result").mkdirs();
                    String fileName = agenda.getAgendaName().replaceAll("[^a-zA-Z0-9]", "_") + ".html";
                    Files.writeString(Path.of("result/" + fileName), html);
                    System.out.println("Generisan: " + fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return selections.stream().anyMatch(o -> o instanceof Agenda);
    }
}
