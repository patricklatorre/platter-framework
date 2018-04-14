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
		nullSection = new Section(NULL_URL, 300, 300);

		/* INITIALIZE SERVICES */


		/* BIND SERVICES TO SECTIONS */


		/* INITIALIZE EXTERNAL SCREENS */

	}

	@Override
	public int prepare() {
		return 0;
	}
}
