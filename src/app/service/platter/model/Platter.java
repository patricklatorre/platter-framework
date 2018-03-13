package app.service.platter.model;

import javafx.stage.Stage;

public abstract class Platter
{
	/* You can place static strings for FXML URLs here */
	public static String NULL_URL = "/app/view/NULL/Default.fxml";

	/* WINDOW */
	protected Stage window;

	/* NULL SECTION */
	protected Section nullSection;

	public int order(){
		return 0;
	}
	public abstract int serve();
}
