package app.service.platter.model;

import app.service.platter.window.WindowResize;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public abstract class Platter
{
	/* You can place static strings for FXML URLs here */
	public static String NULL_URL = "/app/view/NULL/Default.fxml";

	/* ADAPTER CONTEXT */
	protected Section nullSection;

	/* ORDER ATTRIBUTES */
	protected Stage window;
	protected Scene firstScene;

	protected String title;

	protected double minWindowWidth;
	protected double minWindowHeight;
	protected double currWindowWidth;
	protected double currWindowHeight;



	public int serve() {
		order();
		prepare();
		cook();
		return 0;
	}

	private void order() {
		title = "Platter";
		firstScene = nullSection.getInternalScreen();
		minWindowWidth = 1;
		minWindowHeight = 1;
		currWindowWidth = 1;
		currWindowHeight = 1;
	}

	public abstract int prepare();

	public int cook() {
		window = new Stage();

		window.setTitle(title);
		window.setMinWidth(minWindowWidth);
		window.setMinHeight(minWindowHeight);
		WindowResize.resize(window, currWindowWidth, currWindowHeight);
		window.initModality(Modality.APPLICATION_MODAL);

		/* APP WINDOW DISPLAY */
		window.setScene(firstScene);
		window.showAndWait();

		return 0;
	}
}
