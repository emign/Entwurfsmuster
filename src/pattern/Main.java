package pattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root = loader.load();
        Model model = Model.getInstance();
        model.addController((Controller) loader.getController());
        model.reset();




        primaryStage.setTitle("Entwurfsmuster");
        primaryStage.setScene(new Scene(root, 700, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
