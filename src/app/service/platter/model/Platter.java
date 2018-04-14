package app.service.platter.model;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public abstract class Platter
{
	/* You can place static strings for FXML URLs here */
	public static String NULL_URL = "/app/view/NULL/Default.fxml";

	/* DEFAULT SECTION */
	protected Section nullSection;

	/* ORDER ATTRIBUTES */
	protected Stage window;
	protected Scene firstScreen;

	protected String title;

	protected double minWindowWidth;
	protected double minWindowHeight;



	public int serve() {
		order();
		prepare();
		cook();
		return 0;
	}

	private void order() {
		title = "Platter";
		firstScreen = nullSection.getInternalScreen();
		minWindowWidth = 1;
		minWindowHeight = 1;
	}

	public abstract int prepare();

	public int cook() {
		window = new Stage();

		window.setTitle(title);
		window.setMinWidth(minWindowWidth);
		window.setMinHeight(minWindowHeight);
		window.initModality(Modality.APPLICATION_MODAL);

		/* APP WINDOW DISPLAY */
		window.setScene(firstScreen);
		window.showAndWait();

		return 0;
	}
}
