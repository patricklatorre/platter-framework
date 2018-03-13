package app.service.platter.model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Section
{
	private Scene internalScreen;
	private Parent layout;
	private Controller controller;

	public Section(String URL) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(URL));
		this.layout = null;
		try {
			this.layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.controller = loader.getController();
		this.internalScreen = null;
	}

	public Section(String URL, int width, int height) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(URL));
		this.layout = null;
		try {
			this.layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.controller = loader.getController();
		this.internalScreen = new Scene(this.layout, width, height);
	}

	public Scene getInternalScreen() {
		return internalScreen;
	}

	public void setInternalScreen(Scene internalScene) {
		this.internalScreen = internalScene;
	}

	public Parent getLayout() {
		return layout;
	}

	public void setLayout(Parent layout) {
		this.layout = layout;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
}
