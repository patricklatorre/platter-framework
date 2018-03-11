package app.platter;

import app.service.platter.model.Context;
import app.service.platter.model.Platter;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NULLPlatter extends Platter
{
	/* INSTALL SERVICES */


	/* INSTALL CONTEXTS */


	/* DECLARE EXTERNAL SCREENS */
	private Scene nullScreen;

	public NULLPlatter() {
		/* INITIALIZE CONTEXTS */
		this.nullContext = new Context(NULL_URL);

		/* INITIALIZE SERVICES */


		/* BIND SERVICES TO CONTEXTS */


		/* INITIALIZE EXTERNAL SCREENS */
		this.nullScreen = new Scene(nullContext.getLayout(), 300, 300);
	}

	@Override
	public int serve() {
		/* APP WINDOW SETUP */
		Stage window = new Stage();
		window.setTitle("Platter");
		window.setMinWidth(1);
		window.setMinHeight(1);
		window.initModality(Modality.APPLICATION_MODAL);

		/* APP WINDOW DISPLAY */
		window.setScene(nullScreen);
		window.showAndWait();

		return 0;
	}
}
