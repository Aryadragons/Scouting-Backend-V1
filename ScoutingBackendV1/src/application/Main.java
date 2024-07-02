package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;


public class Main extends Application {
	
	// Looking Up Data Menu Items
	private MenuItem searchTeams;
	private MenuItem searchAllince;
	private MenuItem searchAutos;
	private MenuItem compareTeams;
	private MenuItem compareAllince;
	private MenuItem compareAutos;
	private MenuItem findBestTeam;
	private MenuItem findBestAllince;
	private MenuItem findBestAuto;
	private MenuItem findBestStat;
	private MenuItem findBestRobotArchatype;
	// Using Data Menu Items
	private MenuItem createAllince;
	private MenuItem createMatch;
	private MenuItem createAutoplan;
	private MenuItem createMacthPlan;
	//Data Menu Items
	private MenuItem openNewScDataMI;
	private MenuItem openNewPitDataMI;
	private MenuItem openNewDriveTeamDataMI;
	private MenuItem openNewDriveTeamComsMI;
	private MenuItem editScDataMI;
	private MenuItem editPitDataMI;
	private MenuItem editDriveTeamDataMI;
	private MenuItem editDriveTeamComsMI;
	private MenuItem exportPitDataMI;
	private MenuItem exportScDataMI;
	private MenuItem exportDriveTeamDataMI;
	private MenuItem exportDriveTeamComsMI;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//adding menu bar
			MenuBar MB = createMenuBar();
			root.setTop(MB);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private MenuBar createMenuBar() {
		// Creating the Menu Bar
		MenuBar mB = new MenuBar();
		// Creating the Menus
		Menu searchMenu = new Menu("Search:");
		Menu compareMenu = new Menu("Compare:");
		Menu findBestMenu = new Menu("Find The Best:");
		Menu createMenu = new Menu("Create:");
		Menu openMenu = new Menu("Open Data");
		Menu editMenu = new Menu("Edit Data");
		Menu exportMenu = new Menu("Export Data");
		// Creating the Menu Items
		searchTeams = new MenuItem("Teams");
		searchAllince = new MenuItem("Allinces");
		searchAutos = new MenuItem("Autos");
		compareTeams = new MenuItem("Teams");
		compareAllince = new MenuItem("Allinces");
		compareAutos = new MenuItem("Autos");
		findBestTeam = new MenuItem("Team");
		findBestAllince = new MenuItem("Allince");
		findBestAuto = new MenuItem("Auto");
		findBestStat = new MenuItem("Stat");
		findBestRobotArchatype = new MenuItem("Robot Archatype");
		createAllince = new MenuItem("Allince");
		createMatch = new MenuItem("Match");
		createAutoplan = new MenuItem("Auto Plan");
		createMacthPlan = new MenuItem("Macth Plan");
		openNewScDataMI = new MenuItem("Scouting Data");
		openNewPitDataMI = new MenuItem("Pit Data");
		openNewDriveTeamDataMI = new MenuItem("Drive Team Data");
		openNewDriveTeamComsMI = new MenuItem("Drive Team Comments");
		editScDataMI = new MenuItem("Scouting Data");
		editPitDataMI = new MenuItem("Pit Data");
		editDriveTeamDataMI = new MenuItem("Drive Team Data");
		editDriveTeamComsMI = new MenuItem("Drive Team Comments");
		exportScDataMI = new MenuItem("Scouting Data");
		exportPitDataMI = new MenuItem("Pit Data");
		exportDriveTeamDataMI = new MenuItem("Drive Team Data");
		exportDriveTeamComsMI = new MenuItem("Drive Team Comments");
		//Adding Menu Items to their Menus
		searchMenu.getItems().addAll(searchTeams, searchAutos, searchAllince);
		compareMenu.getItems().addAll(compareTeams, compareAllince, compareAutos);
		openMenu.getItems().addAll(openNewScDataMI, openNewPitDataMI, openNewDriveTeamDataMI, openNewDriveTeamComsMI);
		editMenu.getItems().addAll(editScDataMI, editPitDataMI, editDriveTeamDataMI, editDriveTeamComsMI);
		exportMenu.getItems().addAll(exportScDataMI, exportPitDataMI, exportDriveTeamDataMI, exportDriveTeamComsMI);
		//Adding Menu Items to the Menu Bar
		mB.getMenus().addAll(searchMenu, compareMenu, openMenu, editMenu, exportMenu);
		return mB;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
