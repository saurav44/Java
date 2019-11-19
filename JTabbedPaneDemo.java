/*
<applet code = "JTabbedPaneDemo" width = 300 height = 300>
</applet>
 */
import javax.swing.*;
public class JTabbedPaneDemo extends JApplet{
	public void init() {
		try {
			SwingUtilities.invokeAndWait(
					new Runnable() {
						public void run() {
							makeGUI();
						}
					}
			);
		}
		catch(Exception e) {
			System.out.println("Cannot create because of "+e);
		}
	}
	public void makeGUI() {
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Cities ", new CitiesPanel());
		jtp.addTab("Colors ", new ColorsPanel());
		jtp.addTab("Flavors ", new FlavorsPanel());
		add(jtp);
	}
}
