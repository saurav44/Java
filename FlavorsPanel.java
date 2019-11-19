import javax.swing.*;
public class FlavorsPanel extends JPanel {
	public FlavorsPanel() {
		JComboBox jcb = new JComboBox();
		jcb.addItem("Chocolate");
		jcb.addItem("Vanilla");
		jcb.addItem("Strawberry");
		jcb.addItem("Mango");
		add(jcb);
	}
}
