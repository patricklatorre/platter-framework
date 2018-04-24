package app.service.platter.model;

import app.service.platter.cfg.PlatterCfg;
import app.service.platter.sectionManager.Section;
import app.service.platter.windowManager.WindowGrip;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class Platter
{
	protected Stage WINDOW;

	public final static String NULL_SCREEN = "/app/view/NULL/Default.fxml";

	/* DEFAULT SECTION */
	protected Section nullSection;

	/* CONFIGURATION */
	protected PlatterCfg cfg;

	public Platter serve() {
		setConfiguration().cook();
		return this;
	}

	public Platter setConfiguration() {
		nullSection = Section.create()
				.fromFXML(NULL_SCREEN)
				.withInternalScreen(300, 300);

		cfg = new PlatterCfg()
				.setWindowTitle("Platter")
				.setFirstScreen(nullSection.getInternalScreen())
				.setMinWindowHeight(1)
				.setMinWindowWidth(1)
				.setModality(Modality.NONE)
				.setCloseToProceed(false)
				.setBorderlessWindow(false)
				.setGrippyWindow(false);

		return this;
	}

	public Platter cook() {
		WINDOW = new Stage();
		refreshCfg();
		return this;
	}

	public Platter refreshCfg() {
		WINDOW.setTitle(
				cfg.getWindowTitle()
		);
		WINDOW.setMinWidth(
				cfg.getMinWindowWidth()
		);
		WINDOW.setMinHeight(
				cfg.getMinWindowHeight()
		);
		WINDOW.initModality(
				cfg.getModality()
		);


		if (cfg.isBorderlessWindow()) {
			WINDOW.initStyle(StageStyle.UNDECORATED);
		}
		if (cfg.isGrippyWindow()) {
			WindowGrip.rubberize(WINDOW, cfg.getFirstScreen());
		}
		if (cfg.isCloseToProceed()) {
			WINDOW.showAndWait();
		} else {
			WINDOW.show();
		}


		WINDOW.setScene(cfg.getFirstScreen());

		return this;
	}
}
