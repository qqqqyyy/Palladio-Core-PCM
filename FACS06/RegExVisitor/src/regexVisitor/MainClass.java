package regexVisitor;

import java.io.File;
import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import RegEx.Complex;
import RegEx.Expression;
import RegEx.RegExPackage;

public class MainClass {

	public static Expression loadRegEx(String fileName) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extentions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(RegExPackage.eNS_URI,
				RegExPackage.eINSTANCE);

		// Construct the URI for the instance file.
		// The argument is treated as a file path only if it denotes an existing
		// file.
		// Otherwise, it's directly treated as a URL.
		//
		File file = new File(fileName);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
				: URI.createURI(fileName);

		// Demand load resource for this file.
		//
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println("Loaded " + uri);

		// Validate the contents of the loaded resource.
		//
		for (Iterator j = resource.getContents().iterator(); j.hasNext();) {
			EObject eObject = (EObject) j.next();
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				printDiagnostic(diagnostic, "");
			}
		}
		EObject eObject = (EObject)resource.getContents().iterator().next();
		return (Expression) EcoreUtil.getRootContainer(eObject);
	}

	/**
	 * <!-- begin-user-doc --> Prints diagnostics with indentation. <!--
	 * end-user-doc -->
	 * 
	 * @param diagnostic
	 *            the diagnostic to print.
	 * @param indent
	 *            the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
			printDiagnostic((Diagnostic) i.next(), indent + "  ");
		}
	}

	public static void main(String[] args) {
		Expression expr = loadRegEx("/home/jens/workspace/My.regex");
		RegExToStringVisitor visitor = new RegExToStringVisitor(expr);
		System.out.println(visitor.getResult());
		RegExPerformanceVisitor perfVisitor = new RegExPerformanceVisitor(expr);
		Complex[] points = perfVisitor.getResult();
		double sum = 0;
		for (int i = 0; i < points.length; i++) {
			if (points[i].getRe() < 0.0001){
				System.out.println("0");				
			} else {
				System.out.println(points[i].getRe());				
			}
			sum += points[i].getRe();
		}
		System.out.println();
		System.out.println(sum);
	}
}
