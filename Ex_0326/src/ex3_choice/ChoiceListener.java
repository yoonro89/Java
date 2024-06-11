package ex3_choice;

import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceListener implements ItemListener{

	private Label label;
	
	public ChoiceListener(Label label) {
		this.label = label;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Ex2_ChoiceMain.res = (String)e.getItem();
		label.setText( Ex2_ChoiceMain.res );
	}

}
