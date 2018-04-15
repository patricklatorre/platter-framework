package app.service.platter.model;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class Platter
{
	/* You can place static strings for FXML URLs here */
	public static String NULL_URL = "/app/view/NULL/Default.fxml";

	/* DEFAULT SECTION */
	protected Section nullSection;

	/* CONFIGURABLES */
	protected Stage WINDOW;
	protected Scene FIRST_SCREEN;

	protected String WINDOW_TITLE;

	protected double MIN_WINDOW_WIDTH;
	protected double MIN_WINDOW_HEIGHT;

	protected boolean UNIBODY;



	public void serve() {
		order();
		configure();
		cook();
	}

	private void order() {
		WINDOW_TITLE = "Platter";
		FIRST_SCREEN = nullSection.getInternalScreen();
		MIN_WINDOW_WIDTH = 1;
		MIN_WINDOW_HEIGHT = 1;
		UNIBODY = false;
	}

	public abstract void configure();

	public int cook() {
		WINDOW = new Stage();

		WINDOW.setTitle(WINDOW_TITLE);

		WINDOW.setMinWidth(MIN_WINDOW_WIDTH);
		WINDOW.setMinHeight(MIN_WINDOW_HEIGHT);
		WINDOW.initModality(Modality.APPLICATION_MODAL);

		if (UNIBODY) WINDOW.initStyle(StageStyle.UNDECORATED);

		WINDOW.setScene(FIRST_SCREEN);
		WINDOW.showAndWait();

		return 0;
	}
}
