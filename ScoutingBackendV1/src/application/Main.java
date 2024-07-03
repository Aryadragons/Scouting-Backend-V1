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


public class Main extends Application implements EventHandler<ActionEvent>{
	
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
	private TabPane mainTP;
	//Home page Menu Item
	private MenuItem homePageMI;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1400,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//adding menu bar
			MenuBar MB = createMenuBar();
			root.setTop(MB);
			//adding the Tab panes
			mainTP = new TabPane();
			root.setBottom(mainTP);
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
		Menu homePageMenu = new Menu("Home");
		Menu searchMenu = new Menu("Search:");
		Menu compareMenu = new Menu("Compare:");
		Menu findBestMenu = new Menu("Find The Best:");
		Menu createMenu = new Menu("Create:");
		Menu openMenu = new Menu("Open Data");
		Menu editMenu = new Menu("Edit Data");
		Menu exportMenu = new Menu("Export Data");
		// Creating the Menu Items
		//home page
		homePageMI = new MenuItem("Home");
		homePageMI.setOnAction(this);
		//search stuff
		searchTeams = new MenuItem("Teams");
		searchTeams.setOnAction(this);
		searchAllince = new MenuItem("Allinces");
		searchAllince.setOnAction(this);
		searchAutos = new MenuItem("Autos");
		searchAutos.setOnAction(this);
		//compare stuff
		compareTeams = new MenuItem("Teams");
		compareTeams.setOnAction(this);
		compareAllince = new MenuItem("Allinces");
		compareAllince.setOnAction(this);
		compareAutos = new MenuItem("Autos");
		compareAutos.setOnAction(this);
		//find best stuff
		findBestTeam = new MenuItem("Team");
		findBestTeam.setOnAction(this);
		findBestAllince = new MenuItem("Allince");
		findBestAllince.setOnAction(this);
		findBestAuto = new MenuItem("Auto");
		findBestAuto.setOnAction(this);
		findBestStat = new MenuItem("Stat");
		findBestStat.setOnAction(this);
		findBestRobotArchatype = new MenuItem("Robot Archatype");
		findBestRobotArchatype.setOnAction(this);
		//create stuff
		createAllince = new MenuItem("Allince");
		createAllince.setOnAction(this);
		createMatch = new MenuItem("Match");
		createAllince.setOnAction(this);
		createAutoplan = new MenuItem("Auto Plan");
		createAutoplan.setOnAction(this);
		createMacthPlan = new MenuItem("Macth Plan");
		createMacthPlan.setOnAction(this);
		//open stuff
		openNewScDataMI = new MenuItem("Scouting Data");
		openNewScDataMI.setOnAction(this);
		openNewPitDataMI = new MenuItem("Pit Data");
		openNewPitDataMI.setOnAction(this);
		openNewDriveTeamDataMI = new MenuItem("Drive Team Data");
		openNewDriveTeamDataMI.setOnAction(this);
		openNewDriveTeamComsMI = new MenuItem("Drive Team Comments");
		openNewDriveTeamComsMI.setOnAction(this);
		//edit stuff
		editScDataMI = new MenuItem("Scouting Data");
		editScDataMI.setOnAction(this);
		editPitDataMI = new MenuItem("Pit Data");
		editPitDataMI.setOnAction(this);
		editDriveTeamDataMI = new MenuItem("Drive Team Data");
		editDriveTeamDataMI.setOnAction(this);
		editDriveTeamComsMI = new MenuItem("Drive Team Comments");
		editDriveTeamComsMI.setOnAction(this);
		//export stuff
		exportScDataMI = new MenuItem("Scouting Data");
		exportScDataMI.setOnAction(this);
		exportPitDataMI = new MenuItem("Pit Data");
		exportPitDataMI.setOnAction(this);
		exportDriveTeamDataMI = new MenuItem("Drive Team Data");
		exportDriveTeamDataMI.setOnAction(this);
		exportDriveTeamComsMI = new MenuItem("Drive Team Comments");
		exportDriveTeamComsMI.setOnAction(this);
		//Adding Menu Items to their Menus
		homePageMenu.getItems().addAll(homePageMI);
		searchMenu.getItems().addAll(searchTeams, searchAutos, searchAllince);
		compareMenu.getItems().addAll(compareTeams, compareAllince, compareAutos);
		findBestMenu.getItems().addAll(findBestTeam, findBestAllince, findBestAuto, findBestStat, findBestRobotArchatype);
		createMenu.getItems().addAll(createAllince, createMatch, createAutoplan, createMacthPlan);
		openMenu.getItems().addAll(openNewScDataMI, openNewPitDataMI, openNewDriveTeamDataMI, openNewDriveTeamComsMI);
		editMenu.getItems().addAll(editScDataMI, editPitDataMI, editDriveTeamDataMI, editDriveTeamComsMI);
		exportMenu.getItems().addAll(exportScDataMI, exportPitDataMI, exportDriveTeamDataMI, exportDriveTeamComsMI);
		//Adding Menu Items to the Menu Bar
		mB.getMenus().addAll(homePageMenu, searchMenu, compareMenu, findBestMenu, createMenu, openMenu, editMenu, exportMenu);
		return mB;
	}
	
	private void makeSearchTeams() {
		searchTeamsTab seTeams = new searchTeamsTab();
		Tab seTeamsTab = new Tab("Search Teams", seTeams);
		mainTP.getTabs().addAll(seTeamsTab);
	}
	
	private void makeSearchAllinces() {
		searchAllincesTab seAllinces = new searchAllincesTab();
		Tab seAllincesTab = new Tab("Search Allinces", seAllinces);
		mainTP.getTabs().addAll(seAllincesTab);
	}
	
	private void makeSearchAutos() {
		searchAutosTab seAutos = new searchAutosTab();
		Tab seAutosTab = new Tab("Search Autos", seAutos);
		mainTP.getTabs().addAll(seAutosTab);
	}
	
	private void makeCompareTeams() {
		compareTeamsTab comTeams = new compareTeamsTab();
		Tab comTeamsTab = new Tab("Compare Teams", comTeams);
		mainTP.getTabs().addAll(comTeamsTab);
	}
	
	private void makeCompareAllinces() {
		compareAllincesTab comAllinces = new compareAllincesTab();
		Tab comAllincesTab = new Tab("Compare Allinces", comAllinces);
		mainTP.getTabs().addAll(comAllincesTab);
	}
	
	private void makeCompareAutos() {
		compareAutosTab comAutos = new compareAutosTab();
		Tab comAutosTab = new Tab("Compare Autos", comAutos);
		mainTP.getTabs().addAll(comAutosTab);
	}
	
	private void makeFindBestTeam() {
		findBestTeamTab findTeam = new findBestTeamTab();
		Tab findTeamTab = new Tab("Find Best Team", findTeam);
		mainTP.getTabs().addAll(findTeamTab);
	}
	
	private void makeFindBestAllince() {
		findBestAllinceTab findAllince = new findBestAllinceTab();
		Tab findAllinceTab = new Tab("Find Best Allince", findAllince);
		mainTP.getTabs().addAll(findAllinceTab);
	}
	
	private void makeFindBestAuto() {
		findBestAutoTab findAuto = new findBestAutoTab();
		Tab findAutoTab = new Tab("Find Best auto", findAuto);
		mainTP.getTabs().addAll(findAutoTab);
	}
	
	private void makeFindBestStat() {
		findBestStatTab findStat = new findBestStatTab();
		Tab findStatTab = new Tab("Find Best Stat", findStat);
		mainTP.getTabs().addAll(findStatTab);
	}
	
	private void makeFindBestRobotArchatype() {
		findBestRobotArchatype findArchatype = new findBestRobotArchatype();
		Tab findArchatypeTab = new Tab("Find Best Robot Archatype", findArchatype);
		mainTP.getTabs().addAll(findArchatypeTab);
	}
	
	private void makeCreateAllince() {
		createAllinceTab creAllince = new createAllinceTab();
		Tab creAllinceTab = new Tab("Create Allince", creAllince);
		mainTP.getTabs().addAll(creAllinceTab);
	}
	
	private void makeCreateMatch() {
		createMatchTab creMatch = new createMatchTab();
		Tab creMatchTab = new Tab("Create Match", creMatch);
		mainTP.getTabs().addAll(creMatchTab);
	}
	
	private void makeCreateAutoPlan() {
		createAutoPlanTab creAutoPlan = new createAutoPlanTab();
		Tab creAutoPlanTab = new Tab("Create Auto Plan", creAutoPlan);
		mainTP.getTabs().addAll(creAutoPlanTab);
	}
	
	private void makeCreateMatchPlan() {
		
	}
	
	private void makeOpenNewScDataMI() {
		
	}
	
	private void makeOpenNewPitDataMI() {
		
	}
	
	private void makeOpenNewDriveTeamDataMI() {
		
	}
	
	private void makeOpenNewDriveTeamComsMI() {
		
	}
	
	private void makeEditScDataMI() {
		
	}
	
	private void makeEditPitDataMI() {
		
	}
	
	private void makeEditDriveTeamDataMI() {
		
	}
	
	private void makeEditDriveTeamComsMI() {
		
	}
	
	private void makeExportScDataMI() {
		
	}
	
	private void makeExportPitDataMI() {
		
	}
	
	private void makeExportDriveTeamDataMI() {
		
	}
	
	
	private void makeExportDriveTeamComsMI() {
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == searchTeams) {
				makeSearchTeams();
			}
			if(event.getSource() == searchAllince) {
				makeSearchAllinces();
			}
			if(event.getSource() == searchAutos) {
				makeSearchAutos();
			}
			if(event.getSource() == compareTeams) {
				makeCompareTeams();
			}
			if(event.getSource() == compareAllince) {
				makeCompareAllinces();
			}
			if(event.getSource() == compareAutos) {
				makeCompareAutos();
			}
			if(event.getSource() == findBestTeam) {
				makeFindBestTeam();
			}
			if(event.getSource() == findBestAllince) {
				makeFindBestAllince();
			}
			if(event.getSource() == findBestAuto) {
				makeFindBestAuto();
			}
			if(event.getSource() == findBestStat) {
				makeFindBestStat();
			}
			if(event.getSource() == findBestRobotArchatype) {
				makeFindBestRobotArchatype();
			}
			if(event.getSource() == createAllince) {
				makeCreateAllince();
			}
			if(event.getSource() == createMatch) {
				makeCreateMatch();
			}
			if(event.getSource() == createAutoplan) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == openNewScDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == openNewPitDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == openNewDriveTeamDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == openNewDriveTeamComsMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == editScDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == editPitDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == editDriveTeamDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == editDriveTeamComsMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == exportScDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == exportPitDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == exportDriveTeamDataMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == exportDriveTeamComsMI) {
				makeCreateAutoPlan();
			}
		} catch(Exception e) {
			System.out.println("error: " + e);
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
