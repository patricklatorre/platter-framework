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

	@Override
	public void initializeSections() {
		/*
		* INITIALIZE SECTIONS
		* Any section that is declared should be initialized here with the builder method.
		*
		* sample:
		* sampleSection = Platter.create().fromFXML("/app/view/NULL/Default.fxml");
		*
		* To install an internal screen, simply add the withInternalScreen() method
		* sample:
		* sampleSection = Platter.create().fromFXML("/app/view/NULL/Default.fxml").withInternalScreen(width, height);
		* */
	}

	@Override
	public void initializeDocks() {
		/*
		* INITIALIZE DOCKS
		* sample:
		* sampleDock = new SampleDock();
		* */
	}

	@Override
	public void editCfg() {
		/*
		* EDIT CONFIGURATIONS
		*
		* Quick configuration edits supported by Platter can be made here by editing the cfg attribute. You should
		* also set the first screen here.
		*
		* sample:
		* cfg
		* 	.setFirstScreen(sampleSection.getInternalScreen())
		* 	.setWindowTitle("Just Another App")
		* 	.setCloseToProceed(true);
		* */
	}

	@Override
	public void prepare() {
		/*
		* PREPARE METHOD
		* Any additional initializations/edits/processes should be made here.
		* */


	}
}
