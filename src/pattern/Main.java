package pattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root = loader.load();

        Model model = Model.getInstance();

        // Model wird mit dem Controller verknüpft
        model.addController(loader.getController());
        model.reset();

        primaryStage.setTitle("Entwurfsmuster");
        primaryStage.setScene(new Scene(root, 700, 300));
        primaryStage.show();
    }
}
