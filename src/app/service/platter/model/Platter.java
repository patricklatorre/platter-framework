package app.service.platter.model;

import app.servicedock.NULL.NULLDock;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class Platter
{
	/* SERVICE DOCK */
	protected ServiceDock SERVICE_DOCK;

	/* You can place static strings for FXML URLs here */
	public static String NULL_SCREEN = "/app/view/NULL/Default.fxml";

	/* DEFAULT SECTION */
	protected Section nullSection;

	/* CONFIGURABLES */
	protected Stage WINDOW;
	protected Scene FIRST_SCREEN;

	protected String WINDOW_TITLE;

	protected double MIN_WINDOW_WIDTH;
	protected double MIN_WINDOW_HEIGHT;

	protected boolean UNIBODY_WINDOW;



	public void serve() {
		defaultConfigure();
		configure();
		cook();
	}

	private void defaultConfigure() {
		nullSection = new Section(NULL_SCREEN, 300, 300);
		SERVICE_DOCK = new NULLDock();

		WINDOW_TITLE = "Platter";
		FIRST_SCREEN = nullSection.getInternalScreen();
		MIN_WINDOW_WIDTH = 1;
		MIN_WINDOW_HEIGHT = 1;
		UNIBODY_WINDOW = false;
	}

	public abstract void configure();

	public int cook() {
		SERVICE_DOCK.initializeServices();
		WINDOW = new Stage();

		WINDOW.setTitle(WINDOW_TITLE);

		WINDOW.setMinWidth(MIN_WINDOW_WIDTH);
		WINDOW.setMinHeight(MIN_WINDOW_HEIGHT);
		WINDOW.initModality(Modality.APPLICATION_MODAL);

		if (UNIBODY_WINDOW) {
			WINDOW.initStyle(StageStyle.UNDECORATED);
		}

		setScreen(FIRST_SCREEN);
		WINDOW.showAndWait();

		return 0;
	}



	private class Delta { double x, y; }
	public void setScreen(Scene screen) {
		if (UNIBODY_WINDOW) {
			// allow the clock background to be used to drag the clock around.
			final Delta dragDelta = new Delta();

			screen.getRoot().setOnMousePressed(event -> {
				// record a delta distance for the drag and drop operation.
				dragDelta.x = WINDOW.getX() - event.getScreenX();
				dragDelta.y = WINDOW.getY() - event.getScreenY();
			});
			screen.getRoot().setOnMouseDragged(event -> {
				WINDOW.setX(event.getScreenX() + dragDelta.x);
				WINDOW.setY(event.getScreenY() + dragDelta.y);
			});
		}

		WINDOW.setScene(screen);
	}
}
