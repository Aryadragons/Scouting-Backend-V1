package application;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class homePageTab extends GridPane{
	
	
	
	public homePageTab() {
		this.add(new Label("This Program is Design To Data Analyzer For Scouting Data From FRC's 2024 Game"), 0, 0);
		this.add(new Label("The Search Features is for looking up speific Items in your Data and giving you a report on them"), 0, 1);
	}
}
