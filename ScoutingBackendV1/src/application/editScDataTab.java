package application;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class editScDataTab extends GridPane {
	
	
	
	public editScDataTab() {
		this.add(new Label("Manually Add New Scouting Data"), 0, 0);
		this.add(new Label("Edit Scouting Data"), 0, 1);
		this.add(new Label("Delete Part of Scouting Data"), 0, 1);
	}
}
