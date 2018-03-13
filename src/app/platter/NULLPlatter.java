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


	public NULLPlatter() {
		/* INITIALIZE CONTEXTS */
		this.nullContext = new Context(NULL_URL, 300, 300);

		/* INITIALIZE SERVICES */


		/* BIND SERVICES TO CONTEXTS */


		/* INITIALIZE EXTERNAL SCREENS */

	}

	@Override
	public int serve() {
		/* APP WINDOW SETUP */
		this.window = new Stage();
		this.window.setTitle("Platter");
		this.window.setMinWidth(1);
		this.window.setMinHeight(1);
		this.window.initModality(Modality.APPLICATION_MODAL);

		/* APP WINDOW DISPLAY */
		this.window.setScene(this.nullContext.getInternalScreen());
		this.window.showAndWait();

		return 0;
	}
}
