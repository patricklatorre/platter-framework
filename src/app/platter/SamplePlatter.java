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
	* INSTALL SERVICE DOCKS
	* Service docks are a facade that binds services to other services. A service dock also makes
	* updating modules simpler. Each type of service should have its own dock.
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
		* INITIALIZE SERVICEDOCKS
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
	}
}
