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
	* INSTALL DOCKS
	* Docks are a facade that binds all services and listeners to each other.
	* Each dock should not rely on one another.
	*
	* sample:
	* private SampleDock sampleDock;
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


		/*
		* INITIALIZE DOCKS
		*
		* sample:
		* sampleDock = new SampleDock();
		* */

	}

	@Override
	public void configure() {
		/*
		* CONFIGURABLES
		* Set specific variables to quickly configure the application. If no configurables are set,
		* the platter will use the default values.
		*
		* sample:
		* WINDOW_TITLE = "Sample";
		* GRIPPY_WINDOW = true;
		* */


		/*
		* DOCK CONFIGURABLES
		* Dock services can be called and binded here.
		* */
	}
}
