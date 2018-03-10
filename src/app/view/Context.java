package app.view;

import app.controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Context
{
	private Scene internalScreen;
	private Parent layout;
	private Controller controller;

	public Context(String URL) {
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

	public Context(String URL, int width, int height) {
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
