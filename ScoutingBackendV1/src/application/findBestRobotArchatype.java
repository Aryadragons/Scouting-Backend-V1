package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class findBestRobotArchatype extends GridPane{
	
	private ComboBox<String> listArchatypesCB;
	private Button submitB;
	
	public findBestRobotArchatype() {
		this.add(new Label("Select Robot Archatype"), 0, 0);
		listArchatypesCB = new ComboBox<String>();
		listArchatypesCB.getItems().addAll("Amp Bot", "Speaker Bot", "Defense Bot");
		this.add(listArchatypesCB, 1, 0);
		submitB = new Button("Submit");
		this.add(submitB, 2, 0);
	}
}
