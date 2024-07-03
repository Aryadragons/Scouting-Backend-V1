package application;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class compareAllincesTab extends GridPane{
	
	private ComboBox<String> allince1CB;
	private ComboBox<String> allince2CB;
	
	public compareAllincesTab() {
		this.add(new Label("Select Allince 1"), 0, 0);
		this.add(new Label("Select Allince 2"), 0, 1);
		allince1CB = new ComboBox<String>();
		allince2CB = new ComboBox<String>();
		
	}
}
