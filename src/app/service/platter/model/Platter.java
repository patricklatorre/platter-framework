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
		initDefaultSection();
		initDefaultConfig();
		initializeSections();
		initializeDocks();
		prepare();
		cook();
		return this;
	}

	protected void initDefaultSection() {
		nullSection = Section.create()
				.fromFXML(NULL_SCREEN)
				.withInternalScreen(300, 300);
	}

	protected void initDefaultConfig() {
		cfg = new PlatterCfg()
				.setWindowTitle("Platter")
				.setFirstScreen(nullSection.getInternalScreen())
				.setMinWindowHeight(1)
				.setMinWindowWidth(1)
				.setModality(Modality.NONE)
				.setCloseToProceed(false)
				.setBorderlessWindow(false)
				.setGrippyWindow(false);
	}

	public abstract void initializeSections();
	public abstract void initializeDocks();
	public abstract void editCfg();
	public abstract void prepare();

	public void cook() {
		WINDOW = new Stage();
		refreshCfg();
	}

	public void refreshCfg() {
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
	}
}
