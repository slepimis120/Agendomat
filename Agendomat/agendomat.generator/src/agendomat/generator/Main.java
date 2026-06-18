package agendomat.generator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import agendomat.Agenda;
import agendomat.AgendomatPackage;

public class Main {
    public static void main(String[] args) throws Exception {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());

        AgendomatPackage.eINSTANCE.eClass();

        ResourceSet rs = new ResourceSetImpl();
        URI uri = URI.createFileURI(new File("../test/test.xmi").getCanonicalPath());
        Resource resource = rs.getResource(uri, true);

        new File("result").mkdirs();

        AgendaGenerator generator = new AgendaGenerator();

        for (var it = resource.getAllContents(); it.hasNext();) {
            var obj = it.next();

            if (obj instanceof Agenda agenda) {
                String html = generator.generateHtml(agenda).toString();

                Files.writeString(
                    Path.of("result/" + agenda.getAgendaName() + ".html"),
                    html
                );

                System.out.println(
                    "Generisan: " + agenda.getAgendaName() + ".html"
                );
            }
        }
    }
}
