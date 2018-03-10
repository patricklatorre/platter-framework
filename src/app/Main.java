package app;

import app.platter.NULLPlatter;
import app.platter.Platter;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Platter application = new NULLPlatter();

        application.serve();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
