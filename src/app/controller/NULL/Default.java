package app.controller.NULL;

import java.net.URL;
import java.util.ResourceBundle;

import app.controller.Controller;
import javafx.fxml.FXML;

public class Default extends Controller
{
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	public ResourceBundle getResources() {
		return resources;
	}

	public void setResources(ResourceBundle resources) {
		this.resources = resources;
	}

	public URL getLocation() {
		return location;
	}

	public void setLocation(URL location) {
		this.location = location;
	}
}
