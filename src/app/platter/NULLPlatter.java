package app.platter;

import app.service.platter.model.Section;
import app.service.platter.model.Platter;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NULLPlatter extends Platter
{
	/* INSTALL SERVICES */


	/* INSTALL SECTIONS */


	/* DECLARE EXTERNAL SCREENS */


	public NULLPlatter() {
		/* INITIALIZE SECTIONS */
		this.nullSection = new Section(NULL_URL, 300, 300);

		/* INITIALIZE SERVICES */


		/* BIND SERVICES TO SECTIONS */


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
		this.window.setScene(this.nullSection.getInternalScreen());
		this.window.showAndWait();

		return 0;
	}
}
