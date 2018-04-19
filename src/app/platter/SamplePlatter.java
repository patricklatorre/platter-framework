package app.platter;

import app.service.platter.model.Platter;

public class SamplePlatter extends Platter
{
	/*
	* INSTALL SECTIONS
	* Declare your sections here. A platter should have at least one section. If no sections are installed,
	* the platter defaults to the nullSection.
	*
	* sample:
	* private Section sampleSection;
	* */



	/*
	* DECLARE EXTERNAL SCREENS
	* If a multi-layout screen is needed, an external screen should be used to contain the layouts.
	*
	* sample:
	* private Scene sampleScreen;
	* */




	public SamplePlatter() {
		/*
		* INITIALIZE SECTIONS
		*
		* >> To activate the internal screen, simply specify the width and height of the screen:
		* sampleSection = new Section("/app/view/Sample/Default.fxml", 300, 300);
		*
		* >> If using an external screen:
		* sampleSection = new Section("/app/view/Sample/Default.fxml");
		* */

		/* INITIALIZE EXTERNAL SCREENS */

	}

	@Override
	public void configure() {
		/*
		* SET SERVICE DOCK
		* Instantiate the service dock here. If no service dock is instantiated, the platter will
		* default to the NULLDock.
		*
		* sample:
		* serviceDock = new SampleDock();
		* */



		/*
		* CONFIGURABLES
		* Set specific variables to quickly configure the application. If no configurables are set,
		* the platter will use the default values.
		*
		* sample:
		* WINDOW_TITLE = "Sample";
		* GRIPPY_WINDOW = true;
		* */

	}
}
